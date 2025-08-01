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

export class UpsertAgentRequestAgentsInnerEdgesInner {
    /**
    * These are rule IDs that act as conditions to prevent an agent being called unless all the conditions in this list are true.  0 or more conditions under which the source agent can invoke the associated [target] [Agent] If empty, the target can be invoked under any circumstances
    */
    'conditions'?: Array<number>;
    /**
    * If two edges could be invoked and both are not required then the highest priority one should be executed
    */
    'priority'?: number;
    /**
    * A JavaScript condition which must evaluate to true for the agent to be executed
    */
    'scriptCondition'?: string;
    /**
    * The agent ID that should be called if [script_condition] or any of the [conditions] are true
    */
    'targetAgentId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "conditions",
            "baseName": "conditions",
            "type": "Array<number>"
        },
        {
            "name": "priority",
            "baseName": "priority",
            "type": "number"
        },
        {
            "name": "scriptCondition",
            "baseName": "script_condition",
            "type": "string"
        },
        {
            "name": "targetAgentId",
            "baseName": "target_agent_id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return UpsertAgentRequestAgentsInnerEdgesInner.attributeTypeMap;
    }
}

