truncate role cascade;

INSERT INTO role(id, role_name, role_definition_json)
VALUES ('ADMIN', 'ADMINISTRATOR', JSON '{
  "administration": {
    "manageCategories": true,
    "manageEventOrganizers": true,
    "manageAdministrators": true,
    "associateAdminToEventOrganizer": true,
    "manageLabels": true
  },
  "profile": {
    "manageEvents": false,
    "modifyPersonalData": false
  },
  "event": {
    "getEventSubscription": false,
    "listEventsByCategory": false,
    "searchEventByLabel": false,
    "searchEventByName": false,
    "consultEventData": false,
    "subscriptionsHistory": false,
    "accessToEvent": false
  },
  "media": {
    "sendACommentAboutEvent": false,
    "makeRatingAboutEvent": false,
    "recommendEventToAFriend": false,
    "addEventToHisFavourites": false,
    "consultHisFavouritesEvents": false,
    "answerForumQuestion": true,
    "viewForumQuestions": true,
    "makeForumQuestion": false
  }
}'),
       ('USER', 'USER', JSON '{
         "administration": {
           "manageCategories": true,
           "manageEventOrganizers": true,
           "manageAdministrators": true,
           "associateAdminToEventOrganizer": true,
           "manageLabels": true
         },
         "profile": {
           "manageEvents": false,
           "modifyPersonalData": false
         },
         "event": {
           "getEventSubscription": false,
           "listEventsByCategory": false,
           "searchEventByLabel": false,
           "searchEventByName": false,
           "consultEventData": false,
           "subscriptionsHistory": false,
           "accessToEvent": false
         },
         "media": {
           "sendACommentAboutEvent": false,
           "makeRatingAboutEvent": false,
           "recommendEventToAFriend": false,
           "addEventToHisFavourites": false,
           "consultHisFavouritesEvents": false,
           "answerForumQuestion": true,
           "viewForumQuestions": true,
           "makeForumQuestion": false
         }
       }'),
       ('SUPERADMIN', 'SUPERADMIN', JSON '{
         "administration": {
           "manageCategories": true,
           "manageEventOrganizers": true,
           "manageAdministrators": true,
           "associateAdminToEventOrganizer": true,
           "manageLabels": true
         },
         "profile": {
           "manageEvents": false,
           "modifyPersonalData": false
         },
         "event": {
           "getEventSubscription": false,
           "listEventsByCategory": false,
           "searchEventByLabel": false,
           "searchEventByName": false,
           "consultEventData": false,
           "subscriptionsHistory": false,
           "accessToEvent": false
         },
         "media": {
           "sendACommentAboutEvent": false,
           "makeRatingAboutEvent": false,
           "recommendEventToAFriend": false,
           "addEventToHisFavourites": false,
           "consultHisFavouritesEvents": false,
           "answerForumQuestion": true,
           "viewForumQuestions": true,
           "makeForumQuestion": false
         }
       }');