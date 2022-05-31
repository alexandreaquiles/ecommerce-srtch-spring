INSERT into produto (id, cor, nome, preco, tamanho) values (1, 'PRETO', 'Camiseta Juvenil Bart Simpson Tropical Verde/Preto', 49.90, 'MEDIO');

UPDATE produto SET url_imagem =
                       'https://static.riachuelo.com.br/RCHLO/13976230003/portrait/ae10bac5e75cc047661ee96362496c71523cf845.jpg'
where id = 1;
