--
-- STUDY_CDES  (Table) 
--
-- NOTES:  This view holds the values of the CDE for a particular question, 
--         for every study, by using the default "ALL" study values for derivation.
create or replace view study_cdes as
SELECT a.study,
       a.reference_code,
	   a.cde,
	   a.study reference_study
  FROM study_cdes_ctl a
UNION
SELECT c.study,
       a.reference_code,
	   a.cde,
	   a.study reference_study
  FROM clinical_studies c, 
       study_cdes_ctl a
 WHERE a.study = 'ALL'
   AND NOT EXISTS (SELECT 'X'
                    FROM study_cdes_ctl b
                    WHERE b.study = c.study
		      and b.reference_code = a.reference_code 
                      AND b.study <> 'ALL')
/
