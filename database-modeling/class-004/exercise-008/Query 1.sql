use empresa;
select f.primeiro_nome, d.nome, f.funcao from funcionario f join departamento d on f.codigo_de_deartamento = d.codigo order by f.primeiro_nome;
