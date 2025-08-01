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
import { UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal } from './upsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal';

export class UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner {
    'description': string;
    'id'?: number;
    'internal'?: UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal;
    /**
    * Required. The name of the function to call. Must start with a letter or an underscore. Must be a-z, A-Z, 0-9, or contain underscores, dots and dashes, with a maximum length of 64.
    */
    'name': string;
    'parameters': object;
    'response'?: object;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "internal",
            "baseName": "internal",
            "type": "UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInnerInternal"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "object"
        },
        {
            "name": "response",
            "baseName": "response",
            "type": "object"
        }    ];

    static getAttributeTypeMap() {
        return UpsertAgentRequestAgentsInnerRulesInnerToolsInnerFunctionDeclarationsInner.attributeTypeMap;
    }
}

