# -*- coding: cp1252 -*-

conta = input('valor da conta? ')
porcentagem = conta * 0.1
valor = porcentagem + conta

if conta > 0:
    print 'O valor total da sua conta foi',valor

else:
    print 'Não foi possivel calcular esse valor.'

