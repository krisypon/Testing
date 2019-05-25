$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "some feature",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login as end user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login as a user",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "hello@hello.com",
        "hellodarkness"
      ]
    },
    {
      "cells": [
        "bye@hello.com",
        "teatime"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_login_as_a_user(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on account page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "new user registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "I fill the form",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_fill_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am registred as new user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_registred_as_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "new user registration fail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "I leave blank field with *",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_leave_blank_field_with()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do not agree with Privacy Policy",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_do_not_agree_with_Privacy_Policy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am not registred as new user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_not_registred_as_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "new user registration fail",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "I fill the form with \u003cpassword\u003e password",
  "keyword": "When "
});
formatter.step({
  "name": "I am not registred as new user",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password"
      ]
    },
    {
      "cells": [
        "short"
      ]
    },
    {
      "cells": [
        "long"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "new user registration fail",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "I fill the form with short password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_fill_the_form_with_short_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am not registred as new user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_not_registred_as_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "new user registration fail",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "I fill the form with long password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_fill_the_form_with_long_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am not registred as new user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_not_registred_as_new_user()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...x.php?route\u003daccount/[success]\u003e but was:\u003c...x.php?route\u003daccount/[register]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepdefinitions.LoginSteps.i_am_not_registred_as_new_user(LoginSteps.java:92)\r\n\tat ✽.I am not registred as new user(file:src/test/resources/features/login.feature:28)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});