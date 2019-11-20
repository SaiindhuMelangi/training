$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:dm12/dm22.feature");
formatter.feature({
  "name": "login Features",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user enters username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "login page is opened",
  "keyword": "Given "
});
formatter.step({
  "name": "user click on login",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user will be able to open testme homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "lalitha",
        "password123"
      ]
    },
    {
      "cells": [
        "Admin",
        "password456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user enters username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "login1.login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "When "
});
formatter.match({
  "location": "login1.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"lalitha\" and \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "login1.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be able to open testme homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "login1.user_will_be_able_to_open_testme_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user enters username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "login1.login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "When "
});
formatter.match({
  "location": "login1.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Admin\" and \"password456\"",
  "keyword": "And "
});
formatter.match({
  "location": "login1.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be able to open testme homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "login1.user_will_be_able_to_open_testme_homepage()"
});
formatter.result({
  "status": "passed"
});
});