CREATE TABLE signalement (sig_id INTEGER, reporter VARCHAR(30), importance VARCHAR(30), lieu VARCHAR(100), description VARCHAR(100), dateDemande VARCHAR(10), state VARCHAR(30));
CREATE TABLE ordremission (traitId INTEGER, sig_sig_id INTEGER, agent VARCHAR(30),intervenant VARCHAR(30),dateIntervention VARCHAR(30),detailIntervention VARCHAR(30),valid VARCHAR(30));
CREATE TABLE citoyens (id INTEGER, name VARCHAR(30), email VARCHAR(30), password VARCHAR(100));
CREATE TABLE employees (emp_id INTEGER, name VARCHAR(30), job_title VARCHAR(30), department VARCHAR(30));
