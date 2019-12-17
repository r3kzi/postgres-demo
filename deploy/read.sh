#!/usr/bin/env bash

PGPASSWORD=$(kubectl get secret postgres.dwpbank-postgresql.credentials -o 'jsonpath={.data.password}' | base64 -d)
export PGPASSWORD

psql -h 127.0.0.1 -p 5432 -U postgres -d postgres -c "SELECT * FROM ID WHERE ID BETWEEN 399 AND 420"
