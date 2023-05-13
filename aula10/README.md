# REVISÃO DE CÓDIGO - SEGURO_VEICULOS

# GLOSSÁRIO

- declaração de arrays inadequada: a declaração de arrays no estilo data_type var_name[] é inadequada e confusa, recomenda-se a utilização da sintaxe data_type[] var_name.
- returns ilegívels: majoritariamente se trata de returns em métodos booleanos que são muito melhores se os valores são colocados diretamente no return do que uma variável. Colocando uma variável no return numa posição em que a variável sempre terá o mesmo valor ao alcançar aquele return só deixar o código mais complicado de ler.

## TANGENTE À TODO O CÓDIGO

- todos os imports entre packages do projeto estavam errados, tornando impossível a depuração -CORRIGIDO-

## util

### CpfValidator

- declaração de arrays inadequada
- returns pouco legíveis: retornar o valor de uma variável que só pode ter um valor é inadequado e afeta a legibilidade do código, retornar o valor de uma vez o torna mais claro. Aconteceu em todas as condicionais da classe. Variável result desnecessária.
- checagem de dígitos iguais no cpf extremamente verborrágica

### CpfValidatorRefactored

- retorno da função do cálculo do segundo dígito não está sendo armazenada
- preenche cpf recebe valores de forma redundante duas vezes
- métodos da classe com parâmetros redundantes (sempre recebem o mesmo valor)
    - validaQuantidadeMaiorOnze sempre recebe false no parametro
    - existeNaoDigito sempre recebe false no parametro
    - validaIgualdade sempre recebe false no parametro
    - todos acima podem ser refatorados
- problemas de legibilidade nos returns continua
- valor de retorno de algumas funcoes nao precisam ser utilizados
    - preencheVetor
    - preencheZero
- inicialização redundante do primeiro e segundo digito nos metodos:
    - calculaPrimeiroDigito
    - calculaSegundoDigito

### DataUtils

- excecao capturada mas seu tratamento nao vai a lugar algum
- variavel idade redundante em getIdade
- variavel result redundante em validaData

### EstadoCivilValidator

- return statement ilegível

### NacionalidadeValidator

- return statement ilegível

### PassaporteValidator

- return statement ilegível

### SexoValidator

- return statement ilegível

##

### Cliente

- variável redundante em setDataNascimento

### PremioSeguro

- muitas condicionais aninhadas
