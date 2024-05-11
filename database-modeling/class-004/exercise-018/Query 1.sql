use empresa;
select primeiro_nome from funcionario where codigo_de_departamento = (select codigo from departamento where nome = 'Pessoal');
