use empresa;
select f.primeiro_nome, d.nome, f.funcao from funcionario f join departamento d on f.codigo_de_funcionario = f.codigo order by d.nome;
