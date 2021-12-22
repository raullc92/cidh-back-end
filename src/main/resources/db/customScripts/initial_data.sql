
INSERT INTO category VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4a', 'Category 1', 'Description 1', '2021-03-31 09:30:20-07');
INSERT INTO category VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4b', 'Category 2', 'Description 2', '2021-03-31 09:30:20-07');
INSERT INTO category VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4c', 'Category 3', 'Description 3', '2021-03-31 09:30:20-07');
INSERT INTO category VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4d', 'Category 4', 'Description 4', '2021-03-31 09:30:20-07');
INSERT INTO category VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4e', 'Category 5', 'Description 5', '2021-03-31 09:30:20-07');
INSERT INTO category VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4f', 'Category 6', 'Description 6', '2021-03-31 09:30:20-07');

INSERT INTO label VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4a', 'Label 1', 'Description 1', '2021-03-31 09:30:20-07');
INSERT INTO label VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4b', 'Label 2', 'Description 2', '2021-03-31 09:30:20-07');
INSERT INTO label VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4c', 'Label 3', 'Description 3', '2021-03-31 09:30:20-07');
INSERT INTO label VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4d', 'Label 4', 'Description 4', '2021-03-31 09:30:20-07');
INSERT INTO label VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4e', 'Label 5', 'Description 5', '2021-03-31 09:30:20-07');
INSERT INTO label VALUES ('d5a8fae9-d376-4e37-a5b0-46f9128beb4f', 'Label 6', 'Description 6', '2021-03-31 09:30:20-07');

-- Create a user with role SUPERADMIN
INSERT INTO "user" VALUES ('d578fae9-d222-4o37-a5b0-46f9128beb4f', 'SuperAdmin', 'SuperAdmin', 'NOTVALIDATED', 'Some address', 'superadmin@indahou.se', null, true, 'English', '$2a$12$cYd7Izho3U1SdKloTKY83e0QUYZS9dAcVlW45CdjkYr1EHFPH.ymK', NOW(), NOW());
INSERT INTO user_role VALUES ('d5864ae9-d386-4o37-a5b0-46f9120beb4f', 'd578fae9-d222-4o37-a5b0-46f9128beb4f', 'SUPERADMIN');
-- Create a user with role ADMIN
INSERT INTO "user" VALUES ('d578fae9-d376-4o37-a5b0-46f9128beb4f', 'Admin', 'Admin', 'NOTVALIDATED', 'Some address', 'admin@indahou.se', null, true, 'English', '$2a$12$HbyTXCCqe6g40P58rnmwAerxkxHS2yyIAhFF2FNMgCD1WYY9trGH2', NOW(), NOW());
INSERT INTO user_role VALUES ('d578fae9-d386-4o37-a5b0-46f9120beb4f', 'd578fae9-d376-4o37-a5b0-46f9128beb4f', 'ADMIN');

INSERT INTO event_organizer VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb4f', 'Event organizer 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'd578fae9-d376-4o37-a5b0-46f9128beb4f', NOW());
INSERT INTO event_organizer VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb41', 'Event organizer 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'd578fae9-d376-4o37-a5b0-46f9128beb4f', NOW());
INSERT INTO event_organizer VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb42', 'Event organizer 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'd578fae9-d376-4o37-a5b0-46f9128beb4f', NOW());
INSERT INTO event_organizer VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb43', 'Event organizer 4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'd578fae9-d376-4o37-a5b0-46f9128beb4f', NOW());
INSERT INTO event_organizer VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb44', 'Event organizer 5', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'd578fae9-d376-4o37-a5b0-46f9128beb4f', NOW());
INSERT INTO event_organizer VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb45', 'Event organizer 6', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'd578fae9-d376-4o37-a5b0-46f9128beb4f', NOW());

INSERT INTO event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb40', 'Event 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'https://www.masquenegocio.com/wp-content/uploads/2018/03/evento-concierto-874x492.jpg', NOW(), (NOW() + interval '3 days'), 'd578fae9-d376-4e37-a5b0-46f9128beb4f', 'd5a8fae9-d376-4e37-a5b0-46f9128beb4a');
INSERT INTO event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb41', 'Event 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'https://www.masquenegocio.com/wp-content/uploads/2018/03/evento-concierto-874x492.jpg', NOW(), (NOW() + interval '3 days'), 'd578fae9-d376-4e37-a5b0-46f9128beb41', 'd5a8fae9-d376-4e37-a5b0-46f9128beb4b');
INSERT INTO event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb42', 'Event 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'https://www.masquenegocio.com/wp-content/uploads/2018/03/evento-concierto-874x492.jpg', NOW(), (NOW() + interval '3 days'), 'd578fae9-d376-4e37-a5b0-46f9128beb42', 'd5a8fae9-d376-4e37-a5b0-46f9128beb4c');
INSERT INTO event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb43', 'Event 4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'https://www.masquenegocio.com/wp-content/uploads/2018/03/evento-concierto-874x492.jpg', NOW(), (NOW() + interval '3 days'), 'd578fae9-d376-4e37-a5b0-46f9128beb43', 'd5a8fae9-d376-4e37-a5b0-46f9128beb4d');
INSERT INTO event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb44', 'Event 5', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'https://www.masquenegocio.com/wp-content/uploads/2018/03/evento-concierto-874x492.jpg', NOW(), (NOW() + interval '3 days'), 'd578fae9-d376-4e37-a5b0-46f9128beb44', 'd5a8fae9-d376-4e37-a5b0-46f9128beb4e');
INSERT INTO event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb45', 'Event 6', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse pellentesque sed sapien nec efficitur. Integer aliquet vehicula justo non tempus.', 'https://www.masquenegocio.com/wp-content/uploads/2018/03/evento-concierto-874x492.jpg', NOW(), (NOW() + interval '3 days'), 'd578fae9-d376-4e37-a5b0-46f9128beb45', 'd5a8fae9-d376-4e37-a5b0-46f9128beb4f');

INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb40', 'Label 1');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb40', 'Label 2');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb41', 'Label 3');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb41', 'Label 4');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb42', 'Label 5');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb42', 'Label 6');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb43', 'Label 1');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb43', 'Label 2');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb44', 'Label 3');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb44', 'Label 4');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb45', 'Label 5');
INSERT INTO label_event VALUES ('d578fae9-d376-4e37-a5b0-46f9128beb45', 'Label 6');