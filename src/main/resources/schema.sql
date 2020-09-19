/*========================================================================================*/
CREATE TABLE user_info (
    id SERIAL PRIMARY KEY,
    user_name VARCHAR(30) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP NOT NULL DEFAULT now()
);

/*========================================================================================*/
CREATE TABLE project (
    id SERIAL PRIMARY KEY,
    project_name VARCHAR(30) NOT NULL UNIQUE,
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP NOT NULL DEFAULT now()
);

/*========================================================================================*/
DROP TYPE IF EXISTS todo_status;
CREATE TYPE todo_status AS ENUM ('PENDING', 'DONE');

/*========================================================================================*/
CREATE TABLE todo (
    id SERIAL PRIMARY KEY,
    task VARCHAR(50) NOT NULL,
    project_id INTEGER NOT NULL REFERENCES project(id),
    user_id INTEGER NOT NULL REFERENCES user_info(id),
    status todo_status NOT NULL DEFAULT 'PENDING',
    created_at TIMESTAMP NOT NULL DEFAULT now(),
    updated_at TIMESTAMP NOT NULL DEFAULT now()
);

/*========================================================================================*/
CREATE OR REPLACE FUNCTION updated_timestamp_func()
    RETURNS TRIGGER
    LANGUAGE plpgsql AS
    '
    BEGIN
        NEW.updated_at = now();
        RETURN NEW;
    END;
    ';

/*========================================================================================*/
DO $$
DECLARE
    t text;
BEGIN
    FOR t IN
        SELECT table_name FROM information_schema.columns WHERE column_name = 'updated_at'
    LOOP
        EXECUTE format('CREATE TRIGGER trigger_update_timestamp
                        BEFORE UPDATE ON %I
                        FOR EACH ROW EXECUTE PROCEDURE updated_timestamp_func()', t, t);
    END LOOP;
END;
$$ LANGUAGE plpgsql;