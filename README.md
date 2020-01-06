# video-store

## Funcionalidades

### Post de usuário:
#### post no link: http://localhost:8080/users passando o seguinte json:
{
####	"email":"",
####	"name":"",
####	"password":""
}

### Filmes disponíveis: 
#### http://localhost:8080/movies/available

### Devolução e alocação de um filme é feito através do PUT no campo userId da entidade movie. Exemplo de devolução:
### link para put: " http://localhost:8080/movies/Filme 1 algum genero "  JSON:
{
####    "title": "Filme 1 algum genero",
####    "director": "Diretor do filme 1",
####    "storeId": 1,
####    "userId": null
}
### para alocação, no userId é passado o id do usuário.


### Get de filme pelo título:
#### " http://localhost:8080/movies/Filme 1 algum genero "

### Autenticação:
#### A autenticação é feita passando o email e a senha do usuário no formato basic auth.
