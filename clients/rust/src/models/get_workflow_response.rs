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

/// GetWorkflowResponse : GetWorkflow
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetWorkflowResponse {
    #[serde(rename = "events")]
    pub events: Vec<String>,
}

impl GetWorkflowResponse {
    /// GetWorkflow
    pub fn new(events: Vec<String>) -> GetWorkflowResponse {
        GetWorkflowResponse {
            events,
        }
    }
}

