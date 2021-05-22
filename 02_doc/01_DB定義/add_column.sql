--ROLEカラム追加
ALTER TABLE Employee ADD Role VARCHAR(10);

--既存データをADMINに更新
UPDATE employee SET Role = 'ROLE_ADMIN';

--一般ユーザーを追加
INSERT INTO employee (name,Password,Role)VALUES ('user','$2a$10$FLgDLl0JlqHN21sT0brj2.jIQ8qCBK7FewUV5X6IvQO5F6jdQJcLe','ROLE_USER');
INSERT INTO employee (name,Password,Role)VALUES ('admin','$2a$10$FLgDLl0JlqHN21sT0brj2.jIQ8qCBK7FewUV5X6IvQO5F6jdQJcLe','ROLE_ADMIN');