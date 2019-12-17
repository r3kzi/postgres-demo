#!/usr/bin/env bash



helm repo add postgres-operator https://opensource.zalando.com/postgres-operator/charts/postgres-operator/
helm repo update
helm install -f values.yaml postgres-operator ./charts/postgres-operator





