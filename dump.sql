-- Criação da tabela tb_accounts
CREATE TABLE tb_accounts (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(255) NOT NULL,
    document_id VARCHAR2(50) NOT NULL UNIQUE,
    balance NUMBER(19, 2) NOT NULL
);

-- Criação da sequence para gerar os IDs de tb_accounts
CREATE SEQUENCE acc_acc
    START WITH 1
    INCREMENT BY 1
    NOCACHE;

-- Criação da tabela tb_transactions
CREATE TABLE tb_transactions (
    id NUMBER PRIMARY KEY,
    acc_id NUMBER NOT NULL,
    title VARCHAR2(255),
    description VARCHAR2(255),
    value NUMBER(19, 2) NOT NULL,
    date_transaction DATE NOT NULL,
    CONSTRAINT fk_acc_id
        FOREIGN KEY (acc_id) 
        REFERENCES tb_accounts(id)
);

-- Criação da sequence para gerar os IDs de tb_transactions
CREATE SEQUENCE trans_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE;
