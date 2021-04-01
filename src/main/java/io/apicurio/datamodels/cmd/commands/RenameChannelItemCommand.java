/*
 * Copyright 2019 Red Hat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.apicurio.datamodels.cmd.commands;

import io.apicurio.datamodels.asyncapi.models.AaiChannelItem;
import io.apicurio.datamodels.asyncapi.v2.models.Aai20Document;
import io.apicurio.datamodels.cmd.AbstractCommand;
import io.apicurio.datamodels.cmd.util.ModelUtils;
import io.apicurio.datamodels.compat.LoggerCompat;
import io.apicurio.datamodels.core.models.Document;

/**
 * A command used to rename a channel item, along with all references to it.
 * @author c.desc2@gmail.com
 */
public class RenameChannelItemCommand extends AbstractCommand {

    public String _oldChannelName;
    public String _newChannelName;

    RenameChannelItemCommand() {
    }

    RenameChannelItemCommand(String oldChannelName, String newChannelName) {
        this._oldChannelName = oldChannelName;
        this._newChannelName = newChannelName;
    }
    
    /**
     * @see io.apicurio.datamodels.cmd.ICommand#execute(Document)
     */
    @Override
    public void execute(Document document) {
        LoggerCompat.info("[RenameChannelItemCommand] Executing.");
        this._doChannelRename((Aai20Document) document, this._oldChannelName, this._newChannelName);
    }
    
    /**
     * @see io.apicurio.datamodels.cmd.ICommand#undo(Document)
     */
    @Override
    public void undo(Document document) {
        LoggerCompat.info("[RenameChannelItemCommand] Reverting.");
        this._doChannelRename((Aai20Document) document, this._newChannelName, this._oldChannelName);
    }

    /**
     * Does the work of renaming a channel from one name to another.
     * @param document
     * @param from
     * @param to
     * @private
     */
    private void _doChannelRename(Aai20Document document, String from, String to) {
        AaiChannelItem aaiChannel = null;

        if (ModelUtils.isDefined(document.channels)) {
            // If the "to" aaiChannel already exists, do nothing!
            if (!this.isNullOrUndefined(document.channels.get(to))) {
                return;
            }
            aaiChannel = document.channels.remove(from);
        }

        // If we didn't find a aaiChannel with the "from" name, then nothing to do.
        if (this.isNullOrUndefined(aaiChannel)) {
            return;
        }

        // Now we have the aaiChannel - rename it!
        aaiChannel.rename(to);
        document.channels.put(to, aaiChannel);

        // No document visit since channels are only used in #/channels
    }
}
