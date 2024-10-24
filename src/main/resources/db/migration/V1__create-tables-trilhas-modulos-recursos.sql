CREATE TABLE trilhas (
  id BIGINT AUTO_INCREMENT NOT NULL,
   titulo VARCHAR(120) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   CONSTRAINT pk_trilhas PRIMARY KEY (id)
);

CREATE TABLE modulos (
  id BIGINT AUTO_INCREMENT NOT NULL,
   titulo VARCHAR(120) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   CONSTRAINT pk_modulos PRIMARY KEY (id)
);

CREATE TABLE recursos (
  id BIGINT AUTO_INCREMENT NOT NULL,
   tipo VARCHAR(50) NOT NULL,
   conteudo VARCHAR(255) NOT NULL,
   CONSTRAINT pk_recursos PRIMARY KEY (id)
);

CREATE TABLE trilhas_modulos (
  trilha_id BIGINT NOT NULL,
   modulos_id BIGINT NOT NULL
);

ALTER TABLE trilhas_modulos ADD CONSTRAINT uc_trilhas_modulos_modulos UNIQUE (modulos_id);

ALTER TABLE trilhas_modulos ADD CONSTRAINT fk_trimod_on_modulo FOREIGN KEY (modulos_id) REFERENCES modulos (id);

ALTER TABLE trilhas_modulos ADD CONSTRAINT fk_trimod_on_trilha FOREIGN KEY (trilha_id) REFERENCES trilhas (id);

CREATE TABLE modulos_recursos (
  modulo_id BIGINT NOT NULL,
   recursos_id BIGINT NOT NULL
);

ALTER TABLE modulos_recursos ADD CONSTRAINT uc_modulos_recursos_recursos UNIQUE (recursos_id);

ALTER TABLE modulos_recursos ADD CONSTRAINT fk_modrec_on_modulo FOREIGN KEY (modulo_id) REFERENCES modulos (id);

ALTER TABLE modulos_recursos ADD CONSTRAINT fk_modrec_on_recurso FOREIGN KEY (recursos_id) REFERENCES recursos (id);