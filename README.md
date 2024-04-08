# SalesUnity

A equipe SalesUnity esta desenvolvendo uma aplicação web que simplifica o processo de cotação de compras, utilizando APIs para automatização e melhorando a acessibilidade. A plataforma permite solicitar cotações com poucos cliques, reduzindo tarefas manuais e erros. Além disso, enfoca-se na segurança dos dados, implementando medidas para garantir confidencialidade e integridade. A solução é globalmente acessível, virtualizada e hospedada na nuvem. Oferecemos um web service para integração, utilizando uma abordagem de SaaS (Software as a Service) para proporcionar uma solução completa que economiza tempo, recursos e aprimora a eficiência operacional das empresas no cenário de transformação digital.

### Objetivos a serem Alcançados:

- Transformar a experiência de compra, tornando-a intuitiva, eficiente e segura através da criação de uma plataforma autônoma que conecta clientes e fornecedores.
- Simplificar o processo de solicitação de cotações e compras, oferecendo uma abordagem mais eficaz e ágil para empresas de diversos setores.
- Gerar impactos financeiros positivos para as empresas, através da automação e simplificação dos processos, resultando em economias operacionais consideráveis, redução da necessidade de mão de obra e agilização do ciclo de compras.

### Tecnologias utilizadas:

![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Azure](https://img.shields.io/badge/azure-%230072C6.svg?style=for-the-badge&logo=microsoftazure&logoColor=white)
### Documentação(Em breve):
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
### Versionamento:
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
### Ferramentas de desenvolvimento:
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## Diagrama atualizado:
![Diagrama](https://github.com/AdurraIS/SpringAPI_LevelGroupChallenge/assets/119917719/8ed2c8a1-c750-4ba0-ad9f-332e4ee471cb)

## Video da aplicação

Link: https://youtu.be/1tdoSvHnH7M

## Deploy e Testes

  - 1- Clone da Aplicação
      - Realize o Fork da aplicação
  ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/86b39009-b047-46ed-93dd-dba19fb73b5e)

  - 2- Criar Aplicação Web

    ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/2304ec03-5e7c-4d2f-993c-e86a344d48e1)

    ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/6aa542f2-f5fa-4934-9f55-9a4b9e73c754)

      - Não utilizar Base de Dados
        
    ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/b649297c-0e7e-4735-944e-0b5de632521b)

      - Adicionar implementação continua

    ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/311999ac-a150-464b-b422-9141447f6a6c)

      - Ativar acesso público
   
    ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/51c2cb9d-26e8-41fb-953a-7b4597270d19)

      - Não é necessário ativar application insights
   
    ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/4a520b11-593d-43ce-b753-87d4763358ea)

  - 3- Modificação de Action
      - No Repositorio clonado do github, modifique a workflow criada pela azure

        ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/1d859124-ce15-4374-ae9d-b7a1833058a0)

      - Excluir código maven e substituir pelo código abaixo, também eliminando a última linha Package do Deploy Azure

```
      - name: Set up Gradle
        uses: gradle/gradle-build-action@v3    
      
      - name: Build with Gradle
        run: ./gradlew build


      - name: Upload artifact for deployment job
        uses: actions/upload-artifact@v3
        with:
          name: systemapp
          path: '${{ github.workspace }}/build/libs/*.jar'
```

  ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/e15ac515-649f-4321-b4c7-02f87334dc93)

  ![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/ec90d35f-c429-4148-b1ae-26c02e2e4896)

  - 4- Após o Deploy da aplicação, a aplicação estará funcionando corretamente para o uso das requisições, cópie o link no azure e utilize corforme os endpoints

![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/93551d8d-5daa-4c6d-978e-9f5ea85b8a54)

   - Iniciar o cadastro das endpoint, cadastrando uma empresa com o método POST, conforme os códigos:

![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/c66ef5f7-7416-49bb-883f-5969d040905d)

  - Realizar o cadastro e Login, Copiar a chave de acesso e utilizar nas requisições posteriores.

![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/38e6612f-5cb9-4a3f-a0f3-5a976e54b440)

![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/42e73652-1ca9-4e1d-843e-9598d22856ce)

  - O Token é usado no Authorization, com o type = Bearer Token

![image](https://github.com/Lucascontrucci/SpringAPI_LevelGroupChallenge/assets/146679003/46f4ab2c-0833-4be1-a135-d5ee75945b49)


      
## Endpoints(Em breve no Swagger):

- Cadastro de Usuario e Login
  - /auth/login (POST) (LIVRE)
 ```
{
    "email":"teste223",
    "senha":"teste"
}

  ```
  - /auth/register (POST) (LIVRE)
 
 ```
{
    "name":"TesteuserEmpresa",
    "email":"teste2223",
    "senha":"teste",
    "role": "ADMIN",
    "empresa_id":4
}

  ```

    
- Criação
  
  - /api/v1/produtos (POST) (ADMIN) (TOKEN)
```
{
    "description":"lote de caixas",
    "price":30,
    "category_id":2,
    "productType_id":2,
    "empresa_id":4
}
```
  - /api/v1/empresas (POST) (LIVRE)
```
{
    "name":"empresaestde22",
    "cnpj":"2231232",
    "type":2,//tipo da empresa fornecedor ou cliente
    "email":"empresa@edmpresa"
}
```
  - /api/v1/tipoprodutos (POST) (USER) (TOKEN)
```
{
    "name":"Caixa de papelao"
}
```
  - /api/v1/categorias (POST) (USER) (TOKEN)
```
{
    "name":"caixas"
}
```
  - /api/v1/compras (POST) (USER) (TOKEN)
    
- Atualizar
  
  - /api/v1/empresas (PUT) (USER) (TOKEN)
```
{
    "id":4,
    "name":"TesteAdmin",
    "cnpj":"2331234",
    "type":2,//tipo da empresa fornecedor ou cliente
    "email":"testeadmin"
}
```    
  - /api/v1/usuarios (PUT) (USER) (TOKEN)
  - /api/v1/produtos (PUT) (USER) (TOKEN)
  - /api/v1/pedidos (PUT) (USER) (TOKEN)
  - /api/v1/compras (PUT) (USER) (TOKEN)
- Apagar
  - /api/v1/produtos/id (DELETE) (USER) (TOKEN)
  - /api/v1/usuario/id (DELETE) (USER) (TOKEN)
  - /api/v1/empresa/id (DELETE) (USER) (TOKEN)
  - /api/v1/pedidos/id (DELETE) (USER) (TOKEN)
  - /api/v1/compras/id (DELETE) (USER) (TOKEN)
- Get Id
  - /api/v1/produtos/id (GET) (USER) (TOKEN)
  - /api/v1/usuario/id (GET) (USER) (TOKEN)
  - /api/v1/empresa/id (GET) (USER) (TOKEN)
  - /api/v1/pedidos/id (GET) (USER) (TOKEN)
  - /api/v1/compras/id (GET) (USER) (TOKEN)
- Get Paginable
  - /api/v1/empresas?page=0&size=10 (GET) (USER) (TOKEN)
  - /api/v1/pedidos?page=0&size=10 (GET) (USER) (TOKEN)
  - /api/v1/produtos?page=0&size=10 (GET) (USER) (TOKEN)
- Get All
  - /api/v1/categorias (GET) (USER) (TOKEN)
  - /api/v1/tipoprodutos (GET) (USER) (TOKEN)
