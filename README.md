
# Fintech - FIAP 2024.1

## Descrição

Trabalho final de semestre que consiste em um banco virtual onde o usuário pode se cadastrar e fazer transações. O aplicativo foi desenvolvido com base nos conhecimentos adquiridos no primeiro ano de Análise e Desenvolvimento de Sistemas (ADS) da FIAP.

## Tecnologias Utilizadas
- Java 8.0
- SQL (Oracle DB)
- JDBC (Driver Oracle DB para Java 8.0)
- JSP
- Bootstrap
- HTML & CSS
- JavaScript
- Eclipse IDE

## Requisitos do Projeto
- Java 8.0
- JDBC (Java 8)
- Tomcat 9
- Qualquer IDE de sua escolha (preferencialmente Eclipse)

## Como Rodar o Projeto

1. **Instalar o Java 8**  
   Faça o download e instale o Java 8 do [site oficial](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).

2. **Configurar a variável de ambiente JAVA_HOME**  
   No Windows:
   ```sh
   setx JAVA_HOME "C:\Caminho\Para\Java\jdk1.8.0_xx"
   setx PATH "%JAVA_HOME%\bin;%PATH%"
   ```

   No macOS/Linux:
   ```sh
   export JAVA_HOME=/caminho/para/java/jdk1.8.0_xx
   export PATH=$JAVA_HOME/bin:$PATH
   ```

3. **Instalar o JDBC 8**
   Faça o download do driver JDBC do [site da Oracle](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html).

4. **Configurar o Tomcat 9**  
   Faça o download e instale o Tomcat 9 do [site oficial](https://tomcat.apache.org/download-90.cgi).

   No Windows:
   ```sh
   setx CATALINA_HOME "C:\Caminho\Para\Tomcat9"
   ```

   No macOS/Linux:
   ```sh
   export CATALINA_HOME=/caminho/para/tomcat9
   ```

5. **Configurar o Projeto no Eclipse**
   - Abra o Eclipse IDE.
   - Importe o projeto (`File -> Import -> Existing Projects into Workspace`).
   - Configure o servidor Tomcat (`Window -> Preferences -> Server -> Runtime Environments -> Add -> Apache Tomcat v9.0`).

6. **Executar o Projeto**
   - No Eclipse, clique com o botão direito no projeto.
   - Selecione `Run As -> Run on Server`.
   - Escolha o servidor Tomcat configurado e inicie o servidor.

7. **Banco de Dados**
   - Certifique-se de que o Oracle DB está em execução.
   - Execute o script `dump.sql` que está na raiz do projeto para configurar o banco de dados.
   ```sql
   sqlplus username/password@//hostname:port/servicename @dump.sql
   ```

8. **Acessar a Aplicação**
   - Abra o navegador e acesse `http://localhost:8080/fintech`.

Se necessário, consulte o arquivo `dump.sql` na raiz do projeto para configurar o banco de dados.
