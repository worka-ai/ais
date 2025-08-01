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
pub struct CreateAgentRequestAgentsInnerRulesInner {
    #[serde(rename = "content")]
    pub content: String,
    #[serde(rename = "description")]
    pub description: String,
    #[serde(rename = "id")]
    pub id: i64,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "position")]
    pub position: i64,
    #[serde(rename = "rule_created_at")]
    pub rule_created_at: String,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<String>>,
    #[serde(rename = "tenant_id")]
    pub tenant_id: i64,
    #[serde(rename = "tools", skip_serializing_if = "Option::is_none")]
    pub tools: Option<Vec<models::CreateAgentRequestAgentsInnerRulesInnerToolsInner>>,
    #[serde(rename = "version_created_at")]
    pub version_created_at: String,
    #[serde(rename = "version_id")]
    pub version_id: i64,
}

impl CreateAgentRequestAgentsInnerRulesInner {
    pub fn new(content: String, description: String, id: i64, name: String, position: i64, rule_created_at: String, tenant_id: i64, version_created_at: String, version_id: i64) -> CreateAgentRequestAgentsInnerRulesInner {
        CreateAgentRequestAgentsInnerRulesInner {
            content,
            description,
            id,
            name,
            position,
            rule_created_at,
            tags: None,
            tenant_id,
            tools: None,
            version_created_at,
            version_id,
        }
    }
}

