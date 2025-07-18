# coding: utf-8

"""
    

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from worka.models.create_agent_request_agents_inner import CreateAgentRequestAgentsInner

class TestCreateAgentRequestAgentsInner(unittest.TestCase):
    """CreateAgentRequestAgentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CreateAgentRequestAgentsInner:
        """Test CreateAgentRequestAgentsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CreateAgentRequestAgentsInner`
        """
        model = CreateAgentRequestAgentsInner()
        if include_optional:
            return CreateAgentRequestAgentsInner(
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                description = '',
                edges = [
                    worka.models.create_agent_request_agents_inner_edges_inner.CreateAgentRequest_agents_inner_edges_inner(
                        conditions = [
                            56
                            ], 
                        priority = 56, 
                        script_condition = '', 
                        target_agent_id = 56, )
                    ],
                examples = [
                    ''
                    ],
                expected_input = '',
                id = 56,
                is_default = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                name = '',
                rules = [
                    worka.models.create_agent_request_agents_inner_rules_inner.CreateAgentRequest_agents_inner_rules_inner(
                        content = '', 
                        description = '', 
                        id = 56, 
                        name = '', 
                        position = 56, 
                        rule_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        tags = [
                            ''
                            ], 
                        tenant_id = 56, 
                        tools = [
                            worka.models.create_agent_request_agents_inner_rules_inner_tools_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner(
                                description = '', 
                                function_declarations = [
                                    worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner(
                                        description = '', 
                                        id = 56, 
                                        internal = worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal(
                                            provider = '', ), 
                                        name = '', 
                                        parameters = worka.models.parameters.parameters(), 
                                        response = worka.models.response.response(), )
                                    ], 
                                id = 56, 
                                name = '', )
                            ], 
                        version_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        version_id = 56, )
                    ],
                tags = [
                    ''
                    ],
                tenant_id = 56,
                tools = [
                    worka.models.create_agent_request_agents_inner_rules_inner_tools_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner(
                        description = '', 
                        function_declarations = [
                            worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner(
                                description = '', 
                                id = 56, 
                                internal = worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal(
                                    provider = '', 
                                    tags = [
                                        ''
                                        ], ), 
                                name = '', 
                                parameters = worka.models.parameters.parameters(), 
                                response = worka.models.response.response(), )
                            ], 
                        id = 56, 
                        name = '', )
                    ]
            )
        else:
            return CreateAgentRequestAgentsInner(
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                description = '',
                edges = [
                    worka.models.create_agent_request_agents_inner_edges_inner.CreateAgentRequest_agents_inner_edges_inner(
                        conditions = [
                            56
                            ], 
                        priority = 56, 
                        script_condition = '', 
                        target_agent_id = 56, )
                    ],
                expected_input = '',
                id = 56,
                name = '',
                rules = [
                    worka.models.create_agent_request_agents_inner_rules_inner.CreateAgentRequest_agents_inner_rules_inner(
                        content = '', 
                        description = '', 
                        id = 56, 
                        name = '', 
                        position = 56, 
                        rule_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        tags = [
                            ''
                            ], 
                        tenant_id = 56, 
                        tools = [
                            worka.models.create_agent_request_agents_inner_rules_inner_tools_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner(
                                description = '', 
                                function_declarations = [
                                    worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner(
                                        description = '', 
                                        id = 56, 
                                        internal = worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal(
                                            provider = '', ), 
                                        name = '', 
                                        parameters = worka.models.parameters.parameters(), 
                                        response = worka.models.response.response(), )
                                    ], 
                                id = 56, 
                                name = '', )
                            ], 
                        version_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                        version_id = 56, )
                    ],
                tenant_id = 56,
                tools = [
                    worka.models.create_agent_request_agents_inner_rules_inner_tools_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner(
                        description = '', 
                        function_declarations = [
                            worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner(
                                description = '', 
                                id = 56, 
                                internal = worka.models.create_agent_request_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal.CreateAgentRequest_agents_inner_rules_inner_tools_inner_function_declarations_inner_internal(
                                    provider = '', 
                                    tags = [
                                        ''
                                        ], ), 
                                name = '', 
                                parameters = worka.models.parameters.parameters(), 
                                response = worka.models.response.response(), )
                            ], 
                        id = 56, 
                        name = '', )
                    ],
        )
        """

    def testCreateAgentRequestAgentsInner(self):
        """Test CreateAgentRequestAgentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
