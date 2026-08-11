-- Last updated: 11/08/2026, 16:01:31
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;