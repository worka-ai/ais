/*
 * 
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateWorkflowUnderTenantRequestGenerationConfig {
    #[serde(rename = "candidate_count", skip_serializing_if = "Option::is_none")]
    pub candidate_count: Option<i32>,
    #[serde(rename = "max_output_tokens", skip_serializing_if = "Option::is_none")]
    pub max_output_tokens: Option<i32>,
    #[serde(rename = "stop_sequences", skip_serializing_if = "Option::is_none")]
    pub stop_sequences: Option<Vec<String>>,
    #[serde(rename = "temperature", skip_serializing_if = "Option::is_none")]
    pub temperature: Option<f64>,
    #[serde(rename = "top_k", skip_serializing_if = "Option::is_none")]
    pub top_k: Option<i32>,
    #[serde(rename = "top_p", skip_serializing_if = "Option::is_none")]
    pub top_p: Option<f64>,
}

impl CreateWorkflowUnderTenantRequestGenerationConfig {
    pub fn new() -> CreateWorkflowUnderTenantRequestGenerationConfig {
        CreateWorkflowUnderTenantRequestGenerationConfig {
            candidate_count: None,
            max_output_tokens: None,
            stop_sequences: None,
            temperature: None,
            top_k: None,
            top_p: None,
        }
    }
}

