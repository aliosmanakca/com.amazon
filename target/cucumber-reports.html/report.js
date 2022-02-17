$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\US_03.feature");
formatter.feature({
  "name": "user should be able to choose a category from ALL menu and see the subcategories.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to choose a category from ALL menu and see the subcategories.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC_0301"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_goes_to_amazon_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks ALL button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});