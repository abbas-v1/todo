/*========================================================================================*/
INSERT INTO public.project(id, project_name) VALUES
(1, 'Maintenance'),
(2, 'Interior Designing');

/*========================================================================================*/
INSERT INTO public.user_info(id, user_name) VALUES
(1, 'John'),
(2, 'Sarah'),
(3, 'Tom');

/*========================================================================================*/
INSERT INTO public.todo(id, task, project_id, user_id, completed) VALUES
(1, 'Repainting the walls', 1, 1, false),
(2, 'Polishing the doors', 1, 3, false),
(3, 'Fixing the tiles', 1, 1, false),
(4, 'Lounge layout', 2, 2, false),
(5, 'Desining bedroom', 2, 2, false);