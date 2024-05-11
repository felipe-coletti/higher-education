use empresa;
select f.primeiro_nome, d.nome from funcionario f join departamento d on f.codigo_de_departamento = d.codigo where f.funcao = 'Supervisor' order by d.nome;
