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

package io.apicurio.datamodels.combined.visitors;

import io.apicurio.datamodels.asyncapi.visitors.IAaiVisitor;
import io.apicurio.datamodels.core.models.Document;
import io.apicurio.datamodels.core.models.Extension;
import io.apicurio.datamodels.core.models.ValidationProblem;
import io.apicurio.datamodels.core.models.common.Contact;
import io.apicurio.datamodels.core.models.common.ExternalDocumentation;
import io.apicurio.datamodels.core.models.common.ISchemaDefinition;
import io.apicurio.datamodels.core.models.common.Info;
import io.apicurio.datamodels.core.models.common.License;
import io.apicurio.datamodels.core.models.common.Operation;
import io.apicurio.datamodels.core.models.common.Parameter;
import io.apicurio.datamodels.core.models.common.Schema;
import io.apicurio.datamodels.core.models.common.SecurityRequirement;
import io.apicurio.datamodels.core.models.common.SecurityScheme;
import io.apicurio.datamodels.core.models.common.Server;
import io.apicurio.datamodels.core.models.common.ServerVariable;
import io.apicurio.datamodels.core.models.common.Tag;
import io.apicurio.datamodels.openapi.models.IOasPropertySchema;
import io.apicurio.datamodels.openapi.models.IOasResponseDefinition;
import io.apicurio.datamodels.openapi.models.OasHeader;
import io.apicurio.datamodels.openapi.models.OasPathItem;
import io.apicurio.datamodels.openapi.models.OasPaths;
import io.apicurio.datamodels.openapi.models.OasResponse;
import io.apicurio.datamodels.openapi.models.OasResponses;
import io.apicurio.datamodels.openapi.models.OasSchema;
import io.apicurio.datamodels.openapi.models.OasXML;
import io.apicurio.datamodels.openapi.v2.models.Oas20Definitions;
import io.apicurio.datamodels.openapi.v2.models.Oas20Example;
import io.apicurio.datamodels.openapi.v2.models.Oas20Headers;
import io.apicurio.datamodels.openapi.v2.models.Oas20Items;
import io.apicurio.datamodels.openapi.v2.models.Oas20ParameterDefinition;
import io.apicurio.datamodels.openapi.v2.models.Oas20ParameterDefinitions;
import io.apicurio.datamodels.openapi.v2.models.Oas20ResponseDefinitions;
import io.apicurio.datamodels.openapi.v2.models.Oas20Scopes;
import io.apicurio.datamodels.openapi.v2.models.Oas20SecurityDefinitions;
import io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor;
import io.apicurio.datamodels.openapi.v3.models.Oas30ParameterDefinition;
import io.apicurio.datamodels.openapi.v3.visitors.IOas30Visitor;

/**
 * @author eric.wittmann@gmail.com
 */
public class CombinedVisitorAdapter implements IOas20Visitor, IOas30Visitor, IAaiVisitor {

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitPaths(io.apicurio.datamodels.openapi.models.OasPaths)
     */
    @Override
    public void visitPaths(OasPaths node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitPathItem(io.apicurio.datamodels.openapi.models.OasPathItem)
     */
    @Override
    public void visitPathItem(OasPathItem node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitResponse(io.apicurio.datamodels.openapi.models.OasResponse)
     */
    @Override
    public void visitResponse(OasResponse node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitResponses(io.apicurio.datamodels.openapi.models.OasResponses)
     */
    @Override
    public void visitResponses(OasResponses node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitXML(io.apicurio.datamodels.openapi.models.OasXML)
     */
    @Override
    public void visitXML(OasXML node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitAllOfSchema(io.apicurio.datamodels.openapi.models.OasSchema)
     */
    @Override
    public void visitAllOfSchema(OasSchema node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitItemsSchema(io.apicurio.datamodels.openapi.models.OasSchema)
     */
    @Override
    public void visitItemsSchema(OasSchema node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitAdditionalPropertiesSchema(io.apicurio.datamodels.openapi.models.OasSchema)
     */
    @Override
    public void visitAdditionalPropertiesSchema(OasSchema node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitPropertySchema(io.apicurio.datamodels.openapi.models.IOasPropertySchema)
     */
    @Override
    public void visitPropertySchema(IOasPropertySchema node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitDocument(io.apicurio.datamodels.core.models.Document)
     */
    @Override
    public void visitDocument(Document node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitInfo(io.apicurio.datamodels.core.models.common.Info)
     */
    @Override
    public void visitInfo(Info node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitContact(io.apicurio.datamodels.core.models.common.Contact)
     */
    @Override
    public void visitContact(Contact node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitLicense(io.apicurio.datamodels.core.models.common.License)
     */
    @Override
    public void visitLicense(License node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitTag(io.apicurio.datamodels.core.models.common.Tag)
     */
    @Override
    public void visitTag(Tag node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitExternalDocumentation(io.apicurio.datamodels.core.models.common.ExternalDocumentation)
     */
    @Override
    public void visitExternalDocumentation(ExternalDocumentation node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitExtension(io.apicurio.datamodels.core.models.Extension)
     */
    @Override
    public void visitExtension(Extension node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitServer(io.apicurio.datamodels.core.models.common.Server)
     */
    @Override
    public void visitServer(Server node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitSecurityRequirement(io.apicurio.datamodels.core.models.common.SecurityRequirement)
     */
    @Override
    public void visitSecurityRequirement(SecurityRequirement node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitServerVariable(io.apicurio.datamodels.core.models.common.ServerVariable)
     */
    @Override
    public void visitServerVariable(ServerVariable node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitValidationProblem(io.apicurio.datamodels.core.models.ValidationProblem)
     */
    @Override
    public void visitValidationProblem(ValidationProblem problem) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitSchema(io.apicurio.datamodels.core.models.common.Schema)
     */
    @Override
    public void visitSchema(Schema node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitSchemaDefinition(io.apicurio.datamodels.core.models.common.ISchemaDefinition)
     */
    @Override
    public void visitSchemaDefinition(ISchemaDefinition node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitParameter(io.apicurio.datamodels.core.models.common.Parameter)
     */
    @Override
    public void visitParameter(Parameter node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitOperation(io.apicurio.datamodels.core.models.common.Operation)
     */
    @Override
    public void visitOperation(Operation node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.core.visitors.IVisitor#visitSecurityScheme(io.apicurio.datamodels.core.models.common.SecurityScheme)
     */
    @Override
    public void visitSecurityScheme(SecurityScheme node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v3.visitors.IOas30Visitor#visitParameterDefinition(io.apicurio.datamodels.openapi.v3.models.Oas30ParameterDefinition)
     */
    @Override
    public void visitParameterDefinition(Oas30ParameterDefinition node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitParameterDefinition(io.apicurio.datamodels.openapi.v2.models.Oas20ParameterDefinition)
     */
    @Override
    public void visitParameterDefinition(Oas20ParameterDefinition node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitItems(io.apicurio.datamodels.openapi.v2.models.Oas20Items)
     */
    @Override
    public void visitItems(Oas20Items node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitScopes(io.apicurio.datamodels.openapi.v2.models.Oas20Scopes)
     */
    @Override
    public void visitScopes(Oas20Scopes node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitSecurityDefinitions(io.apicurio.datamodels.openapi.v2.models.Oas20SecurityDefinitions)
     */
    @Override
    public void visitSecurityDefinitions(Oas20SecurityDefinitions node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitDefinitions(io.apicurio.datamodels.openapi.v2.models.Oas20Definitions)
     */
    @Override
    public void visitDefinitions(Oas20Definitions node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitParameterDefinitions(io.apicurio.datamodels.openapi.v2.models.Oas20ParameterDefinitions)
     */
    @Override
    public void visitParameterDefinitions(Oas20ParameterDefinitions node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitHeader(io.apicurio.datamodels.openapi.models.OasHeader)
     */
    @Override
    public void visitHeader(OasHeader node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.visitors.IOasVisitor#visitResponseDefinition(io.apicurio.datamodels.openapi.models.IOasResponseDefinition)
     */
    @Override
    public void visitResponseDefinition(IOasResponseDefinition node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitExample(io.apicurio.datamodels.openapi.v2.models.Oas20Example)
     */
    @Override
    public void visitExample(Oas20Example node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitHeaders(io.apicurio.datamodels.openapi.v2.models.Oas20Headers)
     */
    @Override
    public void visitHeaders(Oas20Headers node) {
        
        
    }

    /**
     * @see io.apicurio.datamodels.openapi.v2.visitors.IOas20Visitor#visitResponseDefinitions(io.apicurio.datamodels.openapi.v2.models.Oas20ResponseDefinitions)
     */
    @Override
    public void visitResponseDefinitions(Oas20ResponseDefinitions node) {
        
        
    }

}
