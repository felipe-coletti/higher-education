use empresa;
select sum(f.salario) as total, d.nome from funcionario f join departamento d on f.codigo_de_departamento = d.codigo group by d.nome;
