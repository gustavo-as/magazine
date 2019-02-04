## Projeto para recrutamento Invillie

### Tecnologias

* Spring 'Family' (Boot, core, rest, data, jpa);
* Swagger Documentation - [http://localhost:8080/swagger-ui.html#/](http://localhost:8080/swagger-ui.html#/);
* Security (Basic Authentication)

|ROLES      |USER       |PASSWORD  |  PERMITTED OPERATIONS    |
|-----------|-----------|----------|--------------------------|
|Admin      |`admin`    |`secret`  |POST - PUT - DELETE - GET |
|User       |`user`     |`secret`  |GET                       |

##### * Asynchronous processing
```text
O Spring provê suporte à execução assincrona com a anotação @Async.
Podemos anotar um método com @Async para que o bean seja executado em uma thread separada, tornando-o totalmente independente de outras chamadas.

```

##### * DOCKER
```text
O primeiro passo é criar um Dockerfile na raiz do projeto com as configurações do ambiente necessárias para executar a aplicação, como:
* Configurações de qual imagem será utilizada como base para subir a aplicação;
* Pode definir um diretório para compartilhamento externo;
* Por fim, mas não menos importante, ENTRYPOINT o comando para executar o artefato, dentro da imagem.

O Spotify disponibiliza um plugin para criação da imagem Docker, com o objetivo de abstrair os comandos docker possibilitando a criação da imagem no build da aplicação. 
<build>
  <plugins>
    ...
    <plugin>
      <groupId>com.spotify</groupId>
      <artifactId>docker-maven-plugin</artifactId>
      <version>VERSION GOES HERE</version>
      <configuration>
        <imageName>example</imageName>
        <dockerDirectory>docker</dockerDirectory>
        <resources>
           <resource>
             <targetPath>/</targetPath>
             <directory>${project.build.directory}</directory>
             <include>${project.build.finalName}.jar</include>
           </resource>
        </resources>
      </configuration>
    </plugin>
    ...
  </plugins>
</build>

```

##### * AWS
```text
Por não poder usufruir mais dos beneficios da AWS, foi realizado o deploy da Restfull API na plataforma 
[HEROKU](https://www.heroku.com/home) afim de demonstrar a aplicação publicada, funcional e integrada com a branck Master no GitHub.
```

### Links
* LINK HEROKU - [https://magazine-invillia.herokuapp.com/swagger-ui.html#/](https://magazine-invillia.herokuapp.com/swagger-ui.html#/)

 > **_Obs.:_** As credenciais de acesso da Aplicação em nuvem são as mesmas citadas no inicio do arquivo. 
