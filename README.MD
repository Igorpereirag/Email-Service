 API desenvolvida usando Java, Springboot e AWS Simple Email Service (SES) com Clean Architecture.

## Índice
- Instalação
- Configuração
- Uso
- Endpoints da API
- Banco de Dados
- Contribuição

### Instalação
Clone o repositório:

```bash
git clone https://github.com/Igorpereirag/Email_Service.git
```

Instale as dependências com o Maven.

Atualize o arquivo `application.properties` com suas credenciais da AWS:

```properties
aws.region=us-east-1
aws.accessKeyId=SUA_CHAVE
aws.secretKey=SUA_SECRET
```

### Configuração
Certifique-se de atualizar o arquivo `application.properties` com suas credenciais da AWS.

### Uso
Inicie a aplicação com o Maven.

A API estará acessível em `http://localhost:8080`.

### Endpoints da API
A API fornece os seguintes endpoints:

- **GET EMAIL**
- **POST /api/email/send**: Envia um e-mail do remetente para o destino.

Corpo da requisição (BODY):

```json
{
  "to": "EMAIL",
  "subject": "test",
  "body": "test"
}
```

### Banco de Dados
Não é necessário um banco de dados para esta API.

### Contribuição
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, por favor, abra uma issue ou envie um pull request para o repositório.

Ao contribuir, siga o estilo de código existente, as convenções de commits e envie suas alterações em uma branch separada.
