## Specifications

[Open API Spec](https://github.com/OAI/OpenAPI-Specification)
[Open API Implementation](https://github.com/OAI/OpenAPI-Specification/blob/main/IMPLEMENTATIONS.md)
[Open API Spec](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.1.0.md)

## VSCode Plugings

[OPEN API](42crunch.vscode-openapi)
 - Handy swagger ui renderer for your Spec


## Open API Generator

[OpenApi Generator](https://openapi-generator.tech/)

### Generating Client code

> docker run --rm -v ${PWD}:/local \
>  openapitools/openapi-generator-cli generate \
>  -i /local/spec/openapi-3.0.2.yml 
>  -g java 
>  -o /local/generated-code