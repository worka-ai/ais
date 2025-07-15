# Assumes
# npm install -g @openapitools/openapi-generator-cli

openapi-generator-cli generate \
        -i openapi.json \
        -g rust \
        -o clients/rust \
        --additional-properties=packageName=worka,library=reqwest

openapi-generator-cli generate \
        -i openapi.json \
        -g java \
        -o clients/java \
        --group-id=ai.worka.ais \
        --artifact-id=worka \
        --additional-properties=library=webclient,java8=true

openapi-generator-cli generate \
        -i openapi.json \
        -g typescript-node \
        -o clients/node \
        --additional-properties=npmName=worka,typescriptThreePlus=true

openapi-generator-cli generate \
        -i openapi.json \
        -g python \
        -o clients/python \
        --additional-properties=packageName=worka

openapi-generator-cli generate \
        -i openapi.json \
        -g ruby \
        -o clients/ruby \
        --additional-properties=gemName=worka
