Feature: In this feature a TSR will work on an Opportunity
  by assigning it to a TSR and save with different opportunity stage.

  Scenario: Closed Won
    Given TSR login to salesforce
      And Open an opportunity from Unassigned Oppty listview
    When TSR assign an opportunity to himself
      And save the opportunity with closed won stage
    Then Opportunity should get saved with closed won status

