SELECT
    M.name
FROM
    Employee AS E
JOIN
    Employee AS M
ON
    E.managerId = M.id
GROUP BY
    M.id, M.name
HAVING
    COUNT(E.id) >= 5;