## Tarefa 002 - 17/04/2022 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto **no formato markdown** de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

Para começar, vamos entender o que é uma API. API significa Application Programming Interface, isto é, se trata de uma interface que é utilizada por dois "endpoints" para troca de informações via um contrato que é estabelecido entre essas duas aplicações. O que vai definir esse contrato é o tipo da API, e é aí que entra o conceito de API REST.
REST é um acrônimo para Representational State Transfer, que é um tipo de arquitetura que define um formato de requisições que serão trocadas entre os dois endpoints previamente citados, que no caso são o client e o servidor. Essas requisições são mediadas por HTTP (Hyper Text Transfer Protocol), podendo ser requisições principalmente GET, POST, PUT e DELETE, mas também há outras menos usuais: HEAD, CONNECT, OPTIONS, TRACE e PATCH. Essas requisições podem resultar em diversas possibilidades, e aí existem os códigos de status HTTP. São vários, os mais famosos são o 404, mensagem de erro que se popularizou como meme na internet, e o 200, que indica sucesso na requisição. A título de curiosidade, todos esses códigos são apresentados de forma concisa e descontraída com imagens de cachorros no site [HTTP Status Dogs](https://httpstatusdogs.com/).
É de suma importância entender os princípios que regem a arquitetura REST além de meramente saber da comunicação HTTP, e seguem alguns deles:
- Interface uniforme: as informações são transferidas de forma padronizada.
- Ausência de estado: cada solicitação é tratada isoladamente, de forma que uma não infere algo no comportamento da outra nas regras da API.
- Sistema em camadas: podem existir outros nós entre o client e o servidor, bem como o servidor se conectar a outros nós a fim de gerar uma resposta ao cliente, construindo uma lógica de camadas.
- Capacidade de armazenamento: diz respeito ao uso da memória cache no client, muito famosa nos navegadores principalmente, que é basicamente uma memória que guarda algumas informações a fim de agilizar o trabalho do servidor com informações obtidas de forma muito recorrente.
- Código sob demanda: respostas do servidor podem influenciar diretamente algo na funcionalidade do client.
Dito isso, cabe destacar os benefícios de se utilizar uma API REST. Existem três fatores principais que colocam APIs REST como uma boa opção:
- Escalabilidade: APIs Rest performam bem em grande escala devido à retirada de várias responsabilidades do servidor colocando-as no client com a ajuda da memória cache (ressalva ao tópico da capacidade de armazenamento citada anteriormente).
- Flexibilidade: A separação completa do cliente pro servidor permite que ambas as partes possam sofrer alterações significativas de forma a não alterar o funcionamento uma da outra. Esse desacoplamento é muito positivo.
- Independência: O design de uma API Rest não é afetado pela escolha da linguagem de programação pois é independente dessas. Seja Java, C#, Clojure, Node ou qualquer que seja a linguagem escolhida.