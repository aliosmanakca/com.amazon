$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\US_04.feature");
formatter.feature({
  "name": "when the user searches for a keyword, results must contain the keyword",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "when the user searches for a keyword, results must contain the keyword",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0401"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.step({
  "name": "searches a keyword \"\u003ckeyword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "results contain \"\u003ckeyword\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword"
      ]
    },
    {
      "cells": [
        "java"
      ]
    },
    {
      "cells": [
        "apple"
      ]
    }
  ]
});
formatter.scenario({
  "name": "when the user searches for a keyword, results must contain the keyword",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0401"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_goes_to_amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searches a keyword \"java\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef4.searchesAKeyword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results contain \"java\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef4.resultsContain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "when the user searches for a keyword, results must contain the keyword",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0401"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_goes_to_amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searches a keyword \"apple\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef4.searchesAKeyword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results contain \"apple\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef4.resultsContain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});