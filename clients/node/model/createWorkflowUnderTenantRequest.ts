/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { CreateWorkflowUnderTenantRequestGenerationConfig } from './createWorkflowUnderTenantRequestGenerationConfig';

/**
* CreateWorkflow (under a tenant)
*/
export class CreateWorkflowUnderTenantRequest {
    'agentId'?: number;
    'cachedContent'?: object;
    'conversationId'?: number;
    'cron'?: string;
    'freeform': boolean;
    'generationConfig'?: CreateWorkflowUnderTenantRequestGenerationConfig;
    'input': string;
    'inputEventWeight'?: number;
    'outputEventWeight'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "agentId",
            "baseName": "agent_id",
            "type": "number"
        },
        {
            "name": "cachedContent",
            "baseName": "cached_content",
            "type": "object"
        },
        {
            "name": "conversationId",
            "baseName": "conversation_id",
            "type": "number"
        },
        {
            "name": "cron",
            "baseName": "cron",
            "type": "string"
        },
        {
            "name": "freeform",
            "baseName": "freeform",
            "type": "boolean"
        },
        {
            "name": "generationConfig",
            "baseName": "generation_config",
            "type": "CreateWorkflowUnderTenantRequestGenerationConfig"
        },
        {
            "name": "input",
            "baseName": "input",
            "type": "string"
        },
        {
            "name": "inputEventWeight",
            "baseName": "input_event_weight",
            "type": "number"
        },
        {
            "name": "outputEventWeight",
            "baseName": "output_event_weight",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CreateWorkflowUnderTenantRequest.attributeTypeMap;
    }
}

