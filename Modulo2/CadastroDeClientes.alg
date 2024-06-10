Algoritmo "Cadastro de Cliente"

Var
   encontrado: logico
   localizador, consulta, cdestino: caracter
   i, opcao, n, numero, j, contador: inteiro
   nome: vetor[1..100] de caracter
   cpf: vetor[1..100] de caracter
   cidade: vetor[1..100] de caracter
   destino: vetor[1..100] de caracter
Inicio
   escreval("Bem-vindo! Escolha o seu serviço")
   escreval("")
   escreval("--------------------------------")
   escreval("Escolha 1 para cadastrar clientes")
   escreval("Escolha 2 para consulta de clientes cadastrados")
   escreval("Escolha 3 para cadastrar Destinos")
   escreval("Escolha 4 para consulta de destinos cadastrados")
   escreval("ou 5 para sair")
   escreval("")
   escreval("--------------------------------")


   enquanto opcao <> 5 faca
      leia (opcao)
      escolha opcao
      caso 1
         limpatela
         escreva("(IMPORTANTE)Informe a quantidade: ")
         leia(n)
         para i de 1 ate n faca
         limpatela
         escreval("----Informações do cliente----")
            escreva("Informe o nome ")
            leia(nome[i])
            escreva("Informe o CPF ")
            leia(cpf[i])
         fimpara
         limpatela
         escreval("")
         escreval("Dados Cadastrados!!")
         escreval("")
         escreval("")
         escreval("Escolha 1 para cadastrar clientes")
         escreval("Escolha 2 para consulta de clientes cadastrados")
         escreval("Escolha 3 para cadastrar Destinos")
         escreval("Escolha 4 para consulta de destinos cadastrados")
         escreval("ou 5 para sair")
         escreval("")
         escreval("--------------------------------")
         caso 2
         limpatela
         escreva("Insira o nome para consultar ")
         leia(consulta)
         encontrado<- falso
         para i de 1 ate n faca
            se nome[i] = consulta entao
               escreval("----Cadastro Encontrado!----")
               escreval()
               escreval("Nome: ", nome[i])
               escreval("CPF: ",cpf[i])
               escreval()
               encontrado<- verdadeiro
               interrompa
            fimse
         fimpara
         se encontrado = falso entao
            escreval("CADASTRO NAO ENCONTRADO")
         fimse
         escreval("Escolha 1 para cadastrar clientes")
         escreval("Escolha 2 para consulta de clientes cadastrados")
         escreval("Escolha 3 para cadastrar Destinos")
         escreval("Escolha 4 para consulta de destinos cadastrados")
         escreval("ou 5 para sair")
         escreval("")
         escreval("--------------------------------")
         caso 3
         contador <- 0
         escreva("(IMPORTANTE)Informe a quantidade: ")
         leia(n)
         para i de 1 ate n faca
            limpatela
            escreval("----Informações de Destino----")
            escreva("Cidade de Embarque: ")
            leia(cidade[i])
            escreva("Destino da viagem: ")
            leia(destino[i])
         fimpara
         limpatela
         escreval("")
         escreval("Destinos Cadastrados!!")
         escreval("")
         para i de 1 ate n faca
              contador <- contador +1
              escreval("Voo ",contador,"º de: ",cidade[i]," -> ",destino[i]," (registrado!)")
         fimpara
         escreval("")
         escreval("Escolha 1 para cadastrar clientes")
         escreval("Escolha 2 para consulta de clientes cadastrados")
         escreval("Escolha 3 para cadastrar Destinos")
         escreval("Escolha 4 para consulta de destinos cadastrados")
         escreval("ou 5 para sair")
         escreval("")
         escreval("--------------------------------")
         caso 4
         limpatela
         escreva("Insira o nome da cidade para consultar ")
         escreval()
         leia(consulta)
         encontrado<- falso
         para i de 1 ate n faca
            se consulta = cidade[i] entao
               limpatela
               escreval("----Cidade Encontrada!----")
               escreval()
               escreval("Destinos disponiveis para: ",cidade[i])
               escreval()
               para i de 1 ate n faca
                    escreval("Voo de: ", cidade[i], " -> para: ", destino[i])
               fimpara
               escreval()
               encontrado<- verdadeiro
               escreval()
               interrompa
            fimse
         fimpara
         se encontrado = falso entao
            limpatela
            escreval("CIDADE NAO ENCONTRADO OU VOO CANCELADO")
         fimse
         escreval("------------------------------------")
         escreval("")
         escreval("Escolha 1 para cadastrar clientes")
         escreval("Escolha 2 para consulta de clientes cadastrados")
         escreval("Escolha 3 para cadastrar Destinos")
         escreval("Escolha 4 para consulta de destinos cadastrados")
         escreval("ou 5 para sair")
         escreval("")
         escreval("--------------------------------")
      caso 5
         limpatela
         escreva("Saiu com sucesso do Sistema,volte sempre! ")
         escreval()
      outrocaso
         escreval("OPCAO INVALIDA! OU NAO ENCONTRADA INFORME O ADMINISTRADOR!")
      fimescolha
   fimenquanto



Fimalgoritmo
