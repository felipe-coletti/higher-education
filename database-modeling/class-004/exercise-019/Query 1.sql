use empresa;
select f.primeiro_nome, d.nome from funcionario f join departamento d on f.codigo_de_departamento = d.codigo where f.salario > some(select salario from funcionario where codigo in (select codigo_de_funcionario from departamento));
