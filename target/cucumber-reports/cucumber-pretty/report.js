$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginProfile.feature");
formatter.feature({
  "line": 2,
  "name": "Login Profile",
  "description": "As an employee of the company\nI want to login my employee profile using my credentials\nIn order to collaborate with my colleagues",
  "id": "login-profile",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.before({
  "duration": 2851711596,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User navigates to Company home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the \"Company home\" page on URL \"https://www.burning-glass.com/uk\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Burning Glass Technologies\" message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Company home",
      "offset": 13
    },
    {
      "val": "https://www.burning-glass.com/uk",
      "offset": 40
    }
  ],
  "location": "StepDefinitions.i_am_on_the_page_on_URL(String,String)"
});
formatter.result({
  "duration": 3161532733,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Burning Glass Technologies",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.i_should_see_message(String)"
});
formatter.result({
  "duration": 2340322,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepdefs.StepDefinitions.i_should_see_message(StepDefinitions.java:46)\n\tat ✽.Then I should see \"Burning Glass Technologies\" message(LoginProfile.feature:9)\n",
  "status": "pending"
});
formatter.scenario({
  "line": 11,
  "name": "Navigate to Solutions page",
  "description": "",
  "id": "login-profile;navigate-to-solutions-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I navigate to \"Solutions\" page from top menu bar",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should have landed in \"Solutions\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "below sections would be listed in \"Solutions\" page",
  "rows": [
    {
      "cells": [
        "Corporations"
      ],
      "line": 15
    },
    {
      "cells": [
        "Education"
      ],
      "line": 16
    },
    {
      "cells": [
        "Government and Workforce"
      ],
      "line": 17
    },
    {
      "cells": [
        "Recruiting and Staffing"
      ],
      "line": 18
    },
    {
      "cells": [
        "Strategic Partnerships"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Solutions",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.i_navigate_to_page_from_top_menu_bar(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Solutions",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.i_should_have_landed_in_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Solutions",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.below_sections_would_be_listed_in_page(String,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 150063947,
  "status": "passed"
});
formatter.before({
  "duration": 1424964468,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User navigates to Company home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the \"Company home\" page on URL \"https://www.burning-glass.com/uk\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Burning Glass Technologies\" message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Company home",
      "offset": 13
    },
    {
      "val": "https://www.burning-glass.com/uk",
      "offset": 40
    }
  ],
  "location": "StepDefinitions.i_am_on_the_page_on_URL(String,String)"
});
formatter.result({
  "duration": 2769818597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Burning Glass Technologies",
      "offset": 14
    }
  ],
  "location": "StepDefinitions.i_should_see_message(String)"
});
formatter.result({
  "duration": 180209,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepdefs.StepDefinitions.i_should_see_message(StepDefinitions.java:46)\n\tat ✽.Then I should see \"Burning Glass Technologies\" message(LoginProfile.feature:9)\n",
  "status": "pending"
});
formatter.scenario({
  "line": 21,
  "name": "Verify Navigate to About page",
  "description": "",
  "id": "login-profile;verify-navigate-to-about-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "I navigate to \"About\" page from top menu bar",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should have landed in \"About\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "below sections would be listed in \"About\" page",
  "rows": [
    {
      "cells": [
        "Schedule a Demo"
      ],
      "line": 25
    },
    {
      "cells": [
        "Find Your Solution"
      ],
      "line": 26
    },
    {
      "cells": [
        "Have questions for us?"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "About",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.i_navigate_to_page_from_top_menu_bar(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "About",
      "offset": 25
    }
  ],
  "location": "StepDefinitions.i_should_have_landed_in_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "About",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.below_sections_would_be_listed_in_page(String,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 122013230,
  "status": "passed"
});
});