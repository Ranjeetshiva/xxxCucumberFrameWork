Feature: Vessel Registration

  @JuneRelease
  Scenario: POS should login and enter his vessel information
    Given the "POS" user "POSUSER1" is logged into iportman application
    When user enters "Vessel Registration" in global search
    Then user should be able to see "Vessel Registration" Form
    When user clicks on Side Menu
  #  When user clicks on "Vessel Registration" option from "Marine and Registration"

#    And user clicks on "New" icon
#	#Then verify default fields and sections and Panels are displayed
#    Then verify Record type is "New" in Vessel Details section
#    And user selects the Vessel perfix as "Barge Vessel" out of seven available prefixes
#      |BV|Barge Vessel|
#      |CG|Coast Guard Vessel|
#      |INS|Indian Naval Ship|
#      |MT|Motor Tank|
#      |MV|Motor Vessel|
#      |SV|Supply Vessel|
#      |TV|Tug Vessel|
#
#    And user enters Vessel IMO Number
#    Then verify following fields are auto populated with data
#      |Agency Type|Shipping Agent|
#      |Port of Submission Code|INMAA1|
#      |Port of Submission Name|Chennai Port|
#      |Doc Series|VERETPSEQ12021|
#      |Doc Date|08-07-2021 12:09|
#      |Status Code|DRAFT|
#      |Data Source|POS|