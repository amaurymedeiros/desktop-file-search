#Coding: utf-8
#serie, tamanho da serie e inverso da serie
serie = [int(elemento) for elemento in input("Serie: ").split()]
#serie=([4,11,7,0,3,8,9,2,6,10,1,5])
N=len(serie)
prima=([(i-serie[0])%N for i in serie])
inverso=([(N-i)%N for i in serie])

#Calculo da matriz serial
dif=([(inverso[i]-inverso[0])%N for i in range(N)])
matriz=[]
for j in range(N): matriz.append([(serie[i]+dif[j])%N for i in range(N)])
    
#Primitivo, Retrogrado, Inverso e Retrogrado Inverso
P=[];R=[];I=[];RI=[]
for j in range(N):
    P.append([(prima[i]+j)%N for i in range(N)])
    R.append([P[j][-i-1] for i in range(N)])
    I.append([(dif[i]+j)%N for i in range(N)])
    RI.append([I[j][-i-1] for i in range(N)])

#Combinatoriedade
def comb(serie_comp): 
    n=int(N/2)
    combinatorial=([],[],[],[])
    for j in range(N):
        formP=formI=formRI=formR=0
        for i in range(n):
            if P[j][i] in serie_comp[:n]: formP=formP+1
            if I[j][i] in serie_comp[:n]: formI=formI+1
            if R[j][i] in serie_comp[:n]: formR=formR+1
            if RI[j][i] in serie_comp[:n]: formRI=formRI+1
        if formP==0: combinatorial[0].append(j)
        if formI==0: combinatorial[1].append(j)    
        if formR==0: combinatorial[2].append(j)
        if formRI==0: combinatorial[3].append(j)

    return combinatorial
    

#Composicao Serial
def mapear(sequencia):
    mapa = [elemento for elemento in input("Mapa: ").split()]
    mapeado=[mapa[i] for i in sequencia]
    return mapeado
 
#nota=['C','C#','D','Eb','E','F','F#','G','Ab','A','Bb','B'];
#dinamica=['ppp','pp','p','mp','mf','f','ff','fff'];
#ritmo=['sm.', 'c','3c','m','3sm','m.','csmc'];
#instrumento=['tpt1','tpt2','Hn','tbn','tuba']
#sequencia1=P[0]+I[3]+ R[2]+RI[5]+P[2]+RI[0]
#sequencia2=I[5]+R[1]+RI[6]+P[6]+RI[4]+R[6]






    

