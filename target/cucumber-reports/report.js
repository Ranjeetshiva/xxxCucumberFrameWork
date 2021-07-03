$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/admin/configurations/AttachmentMaster.feature");
formatter.feature({
  "name": "Guess The Work",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Maker starts the game",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@JuneRelease"
    }
  ]
});
formatter.step({
  "name": "the Maker has started a game with the work \"silky\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.AdminStepDefinitions.theMakerHasStartedAGameWithTheWork(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Breaker joins the maker\u0027s game",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.AdminStepDefinitions.the_Breaker_joins_the_maker_s_game()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the breaker must guess",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.AdminStepDefinitions.theBreakerMustGuess()"
});
formatter.result({
  "status": "passed"
});
});