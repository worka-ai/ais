# coding: utf-8

"""
    

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from worka.models.update_llm_config_response import UpdateLLMConfigResponse

class TestUpdateLLMConfigResponse(unittest.TestCase):
    """UpdateLLMConfigResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateLLMConfigResponse:
        """Test UpdateLLMConfigResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateLLMConfigResponse`
        """
        model = UpdateLLMConfigResponse()
        if include_optional:
            return UpdateLLMConfigResponse(
                message = ''
            )
        else:
            return UpdateLLMConfigResponse(
                message = '',
        )
        """

    def testUpdateLLMConfigResponse(self):
        """Test UpdateLLMConfigResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
