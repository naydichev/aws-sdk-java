/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The model ID.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The model type.
     * </p>
     */
    private String modelType;
    /**
     * <p>
     * The model description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The training data source location in Amazon S3.
     * </p>
     */
    private TrainingDataSource trainingDataSource;
    /**
     * <p>
     * The model input variables.
     * </p>
     */
    private java.util.List<ModelVariable> modelVariables;
    /**
     * <p>
     * The label schema.
     * </p>
     */
    private LabelSchema labelSchema;

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @param modelId
     *        The model ID.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @return The model ID.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @param modelId
     *        The model ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutModelRequest withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @see ModelTypeEnum
     */

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @return The model type.
     * @see ModelTypeEnum
     */

    public String getModelType() {
        return this.modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public PutModelRequest withModelType(String modelType) {
        setModelType(modelType);
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public PutModelRequest withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * 
     * @param description
     *        The model description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * 
     * @return The model description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * 
     * @param description
     *        The model description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutModelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The training data source location in Amazon S3.
     * </p>
     * 
     * @param trainingDataSource
     *        The training data source location in Amazon S3.
     */

    public void setTrainingDataSource(TrainingDataSource trainingDataSource) {
        this.trainingDataSource = trainingDataSource;
    }

    /**
     * <p>
     * The training data source location in Amazon S3.
     * </p>
     * 
     * @return The training data source location in Amazon S3.
     */

    public TrainingDataSource getTrainingDataSource() {
        return this.trainingDataSource;
    }

    /**
     * <p>
     * The training data source location in Amazon S3.
     * </p>
     * 
     * @param trainingDataSource
     *        The training data source location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutModelRequest withTrainingDataSource(TrainingDataSource trainingDataSource) {
        setTrainingDataSource(trainingDataSource);
        return this;
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     * 
     * @return The model input variables.
     */

    public java.util.List<ModelVariable> getModelVariables() {
        return modelVariables;
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     * 
     * @param modelVariables
     *        The model input variables.
     */

    public void setModelVariables(java.util.Collection<ModelVariable> modelVariables) {
        if (modelVariables == null) {
            this.modelVariables = null;
            return;
        }

        this.modelVariables = new java.util.ArrayList<ModelVariable>(modelVariables);
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVariables(java.util.Collection)} or {@link #withModelVariables(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVariables
     *        The model input variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutModelRequest withModelVariables(ModelVariable... modelVariables) {
        if (this.modelVariables == null) {
            setModelVariables(new java.util.ArrayList<ModelVariable>(modelVariables.length));
        }
        for (ModelVariable ele : modelVariables) {
            this.modelVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The model input variables.
     * </p>
     * 
     * @param modelVariables
     *        The model input variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutModelRequest withModelVariables(java.util.Collection<ModelVariable> modelVariables) {
        setModelVariables(modelVariables);
        return this;
    }

    /**
     * <p>
     * The label schema.
     * </p>
     * 
     * @param labelSchema
     *        The label schema.
     */

    public void setLabelSchema(LabelSchema labelSchema) {
        this.labelSchema = labelSchema;
    }

    /**
     * <p>
     * The label schema.
     * </p>
     * 
     * @return The label schema.
     */

    public LabelSchema getLabelSchema() {
        return this.labelSchema;
    }

    /**
     * <p>
     * The label schema.
     * </p>
     * 
     * @param labelSchema
     *        The label schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutModelRequest withLabelSchema(LabelSchema labelSchema) {
        setLabelSchema(labelSchema);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getModelType() != null)
            sb.append("ModelType: ").append(getModelType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTrainingDataSource() != null)
            sb.append("TrainingDataSource: ").append(getTrainingDataSource()).append(",");
        if (getModelVariables() != null)
            sb.append("ModelVariables: ").append(getModelVariables()).append(",");
        if (getLabelSchema() != null)
            sb.append("LabelSchema: ").append(getLabelSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutModelRequest == false)
            return false;
        PutModelRequest other = (PutModelRequest) obj;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTrainingDataSource() == null ^ this.getTrainingDataSource() == null)
            return false;
        if (other.getTrainingDataSource() != null && other.getTrainingDataSource().equals(this.getTrainingDataSource()) == false)
            return false;
        if (other.getModelVariables() == null ^ this.getModelVariables() == null)
            return false;
        if (other.getModelVariables() != null && other.getModelVariables().equals(this.getModelVariables()) == false)
            return false;
        if (other.getLabelSchema() == null ^ this.getLabelSchema() == null)
            return false;
        if (other.getLabelSchema() != null && other.getLabelSchema().equals(this.getLabelSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataSource() == null) ? 0 : getTrainingDataSource().hashCode());
        hashCode = prime * hashCode + ((getModelVariables() == null) ? 0 : getModelVariables().hashCode());
        hashCode = prime * hashCode + ((getLabelSchema() == null) ? 0 : getLabelSchema().hashCode());
        return hashCode;
    }

    @Override
    public PutModelRequest clone() {
        return (PutModelRequest) super.clone();
    }

}
