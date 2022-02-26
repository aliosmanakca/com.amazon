$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\ui_feature\\ExcelTesting.feature");
formatter.feature({
  "name": "user shouldn\u0027t be able to login with invalid credentials. (Excel attempt)",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@excel"
    }
  ]
});
formatter.scenarioOutline({
  "name": "user shouldn\u0027t be able to login with invalid credentials (Excel attempt)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_0201"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.step({
  "name": "clicks login button",
  "keyword": "Then "
});
formatter.step({
  "name": "fills the credentials from given \"\u003csheetname\u003e\" and \"\u003crownumber\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "sheetname",
        "",
        "rownumber"
      ]
    },
    {
      "cells": [
        "Sheet1",
        "",
        "1"
      ]
    },
    {
      "cells": [
        "Sheet1",
        "",
        "2"
      ]
    },
    {
      "cells": [
        "Sheet1",
        "",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user shouldn\u0027t be able to login with invalid credentials (Excel attempt)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@excel"
    },
    {
      "name": "@TC_0201"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills the credentials from given \"Sheet1\" and \"1\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "user shouldn\u0027t be able to login with invalid credentials (Excel attempt)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@excel"
    },
    {
      "name": "@TC_0201"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills the credentials from given \"Sheet1\" and \"2\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "user shouldn\u0027t be able to login with invalid credentials (Excel attempt)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@excel"
    },
    {
      "name": "@TC_0201"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "fills the credentials from given \"Sheet1\" and \"3\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});