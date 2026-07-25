#!/usr/bin/env bash
set -euo pipefail
mvn -B -f backend/pom.xml verify
