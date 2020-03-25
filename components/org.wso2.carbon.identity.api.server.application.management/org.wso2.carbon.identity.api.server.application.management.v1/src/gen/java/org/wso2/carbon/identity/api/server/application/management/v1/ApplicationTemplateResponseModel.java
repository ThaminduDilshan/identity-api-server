/*
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.identity.api.server.application.management.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class ApplicationTemplateResponseModel  {
  
    private String id;
    private String name;
    private String description;
    private String image;
    private String inboundProtocol;
    private String types;
    private File application;

    /**
    **/
    public ApplicationTemplateResponseModel id(String id) {

        this.id = id;
        return this;
    }
    
    @ApiModelProperty(example = "85e3f4b8-0d22-4181-b1e3-1651f71b88bd", value = "")
    @JsonProperty("id")
    @Valid
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    /**
    **/
    public ApplicationTemplateResponseModel name(String name) {

        this.name = name;
        return this;
    }
    
    @ApiModelProperty(example = "OIDC Protocol Template", value = "")
    @JsonProperty("name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
    **/
    public ApplicationTemplateResponseModel description(String description) {

        this.description = description;
        return this;
    }
    
    @ApiModelProperty(example = "Template to be used for Single Page Applications", value = "")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    **/
    public ApplicationTemplateResponseModel image(String image) {

        this.image = image;
        return this;
    }
    
    @ApiModelProperty(example = "https://example.com/logo/my-logo.png", value = "")
    @JsonProperty("image")
    @Valid
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    /**
    **/
    public ApplicationTemplateResponseModel inboundProtocol(String inboundProtocol) {

        this.inboundProtocol = inboundProtocol;
        return this;
    }
    
    @ApiModelProperty(example = "oidc", value = "")
    @JsonProperty("inboundProtocol")
    @Valid
    public String getInboundProtocol() {
        return inboundProtocol;
    }
    public void setInboundProtocol(String inboundProtocol) {
        this.inboundProtocol = inboundProtocol;
    }

    /**
    **/
    public ApplicationTemplateResponseModel types(String types) {

        this.types = types;
        return this;
    }
    
    @ApiModelProperty(example = "react,angular", value = "")
    @JsonProperty("types")
    @Valid
    public String getTypes() {
        return types;
    }
    public void setTypes(String types) {
        this.types = types;
    }

    /**
    **/
    public ApplicationTemplateResponseModel application(File application) {

        this.application = application;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("application")
    @Valid
    public File getApplication() {
        return application;
    }
    public void setApplication(File application) {
        this.application = application;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationTemplateResponseModel applicationTemplateResponseModel = (ApplicationTemplateResponseModel) o;
        return Objects.equals(this.id, applicationTemplateResponseModel.id) &&
            Objects.equals(this.name, applicationTemplateResponseModel.name) &&
            Objects.equals(this.description, applicationTemplateResponseModel.description) &&
            Objects.equals(this.image, applicationTemplateResponseModel.image) &&
            Objects.equals(this.inboundProtocol, applicationTemplateResponseModel.inboundProtocol) &&
            Objects.equals(this.types, applicationTemplateResponseModel.types) &&
            Objects.equals(this.application, applicationTemplateResponseModel.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, image, inboundProtocol, types, application);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationTemplateResponseModel {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    inboundProtocol: ").append(toIndentedString(inboundProtocol)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

