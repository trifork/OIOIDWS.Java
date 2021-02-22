package bootstrap;

import client.Application;
import client.sts.ScenarioSingleton;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import sts.TestStsClient;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"file:../../examples/oio-idws-rest/rest-client/src/main/resources/cxf.xml"})
public class RestBootstrapScenarioDotnetTest {


    @Ignore("Ignored for now - deployments needed to automate getting bootstrap token")
    @Test
    public void testBootstrapScenario_toDotnetWSP() {
        //TODO automate getting bootstrap token (see bootstrap tests)
        //Paste bootstrap token here:
        String bootstrapBase64 = "PEFzc2VydGlvbiBJRD0iX2M1ODY3OGZkLTkwYmYtNGViNi04NGEwLWQ1YzUyNTc0ZTVkZCIgSXNzdWVJbnN0YW50PSIyMDIxLTAyLTIyVDE0OjM4OjM1Ljg0MloiIFZlcnNpb249IjIuMCIgeG1sbnM9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iPjxJc3N1ZXI+aHR0cHM6Ly9zYW1sLnRlc3QtbmVtbG9nLWluLmRrLzwvSXNzdWVyPjxTaWduYXR1cmUgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxTaWduZWRJbmZvPjxDYW5vbmljYWxpemF0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIiAvPjxTaWduYXR1cmVNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNyc2Etc2hhMjU2IiAvPjxSZWZlcmVuY2UgVVJJPSIjX2M1ODY3OGZkLTkwYmYtNGViNi04NGEwLWQ1YzUyNTc0ZTVkZCI+PFRyYW5zZm9ybXM+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIiAvPjxUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiIC8+PC9UcmFuc2Zvcm1zPjxEaWdlc3RNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyNzaGEyNTYiIC8+PERpZ2VzdFZhbHVlPkEwYWc4TEFPQkVPSnA5WEVWTEQrTmFuZzJ0VHVTcFVPTHNjZDFkTGFjNEk9PC9EaWdlc3RWYWx1ZT48L1JlZmVyZW5jZT48L1NpZ25lZEluZm8+PFNpZ25hdHVyZVZhbHVlPmN2RUhZcHhaV0E5WGFBWEliS3o0SFhOZWV6STRpWlZoeHd1TklvTGJ4VjFtUjNXRGh1eHo3Y1RuSEF6Syt4S1pNOUpzTmVJa1NOdVlibzBmOGtuMDJOdklhZEVVRkowS0JGaldMcDY1dzUwQ2xIQ3RUelBMZytEbFIyNE1VS2pUVGFaQzJCcjdVTERwRmIvM2VIOVIzaldDQnBvS3BrTUdaWThCWTVtSTRVbmtVSVdFZWY4NFpXVWtCZy9NYVhXdC9aMzZGckpOTXB3WTRiTStHMDFzRkdYc2NGVmV4QVRXUFZRWm1NenRyMTRNWVhmWEJUN3FXMGNDeXl3QnczMlpiN3kzMnc5bzhLblEvelRaYkJIbzM1eE4zY3dlM2dMb1ArMXNqZVhoRldrdjRoRlBrVmRUdmh1RUFCUTE0MG5IeXZRSTcyZy9BQ2x1VzZLL0ZTN1d2Zz09PC9TaWduYXR1cmVWYWx1ZT48S2V5SW5mbz48WDUwOURhdGE+PFg1MDlDZXJ0aWZpY2F0ZT5NSUlHTERDQ0JSU2dBd0lCQWdJRVhPaE9BakFOQmdrcWhraUc5dzBCQVFzRkFEQkpNUXN3Q1FZRFZRUUdFd0pFU3pFU01CQUdBMVVFQ2d3SlZGSlZVMVF5TkRBNE1TWXdKQVlEVlFRRERCMVVVbFZUVkRJME1EZ2dVM2x6ZEdWdGRHVnpkQ0JZV0ZoSlZpQkRRVEFlRncweU1EQXlNalV5TVRJd01EVmFGdzB5TXpBeU1qVXlNVEUzTWpGYU1JR1dNUXN3Q1FZRFZRUUdFd0pFU3pFeE1DOEdBMVVFQ2d3b1JHbG5hWFJoYkdselpYSnBibWR6YzNSNWNtVnNjMlZ1SUM4dklFTldVam96TkRBMU1URTNPREZVTUNBR0ExVUVCUk1aUTFaU09qTTBNRFV4TVRjNExVWkpSRG8xTmprME1EUXhNekF3QmdOVkJBTU1LVTVsYlV4dlp5MXBiaUJCUkVaVElGUmxjM1FnS0daMWJtdDBhVzl1YzJObGNuUnBabWxyWVhRcE1JSUJJakFOQmdrcWhraUc5dzBCQVFFRkFBT0NBUThBTUlJQkNnS0NBUUVBd2hxWG94dm5yZzFSOEdTQU9tV2R2UjBscmRSalRzczl6ekpjL2owekhlYW1qc095TWRUYzc4N1FkeTJ5cmU3NEltemJCSVJHaTdISTNQSVA1OVBlYkZablZPVWErL1kxZW51UThIWmdKbmFacU1DeFByUStTdVUzaUQ5OVdUdld0ejZ4K1cxQkxHaUlKSzVYa3o4eTNZYTgyT1oyNUx3VStWWEVvdllFbVBGTkVDVjd6OXlXa0NjTFpyZkY0bXdLYklkcjk2bzl1RmF2dGlUaE1TRC9Ya0Q0MGFoZHZEYXAxM3RWK0hCQklWd2EwZ0FqWWUxQ3oyallQUnZDVkN5NWFkRGdvRHJQN1dUU2lwdmdhN0E5WThXSVo1Mm5ETGdVbHE2N3JLNDE2dHJwNnpUaFhBeXpwRFM5OGU5OU1WUHkzMk92cHF2dzhwaGRMcVQ2VHE4eTN3SURBUUFCbzRJQ3pEQ0NBc2d3RGdZRFZSMFBBUUgvQkFRREFnTzRNSUdYQmdnckJnRUZCUWNCQVFTQmlqQ0JoekE4QmdnckJnRUZCUWN3QVlZd2FIUjBjRG92TDI5amMzQXVjM2x6ZEdWdGRHVnpkRE0wTG5SeWRYTjBNalF3T0M1amIyMHZjbVZ6Y0c5dVpHVnlNRWNHQ0NzR0FRVUZCekFDaGp0b2RIUndPaTh2Wmk1aGFXRXVjM2x6ZEdWdGRHVnpkRE0wTG5SeWRYTjBNalF3T0M1amIyMHZjM2x6ZEdWdGRHVnpkRE0wTFdOaExtTmxjakNDQVNBR0ExVWRJQVNDQVJjd2dnRVRNSUlCRHdZTkt3WUJCQUdCOUZFQ0JBWUVBekNCL1RBdkJnZ3JCZ0VGQlFjQ0FSWWphSFIwY0RvdkwzZDNkeTUwY25WemRESTBNRGd1WTI5dEwzSmxjRzl6YVhSdmNua3dnY2tHQ0NzR0FRVUZCd0lDTUlHOE1Bd1dCVVJoYmtsRU1BTUNBUUVhZ2F0RVlXNUpSQ0IwWlhOMElHTmxjblJwWm1scllYUmxjaUJtY21FZ1pHVnVibVVnUTBFZ2RXUnpkR1ZrWlhNZ2RXNWtaWElnVDBsRUlERXVNeTQyTGpFdU5DNHhMak14TXpFekxqSXVOQzQyTGpRdU15NGdSR0Z1U1VRZ2RHVnpkQ0JqWlhKMGFXWnBZMkYwWlhNZ1puSnZiU0IwYUdseklFTkJJR0Z5WlNCcGMzTjFaV1FnZFc1a1pYSWdUMGxFSURFdU15NDJMakV1TkM0eExqTXhNekV6TGpJdU5DNDJMalF1TXk0d2dhd0dBMVVkSHdTQnBEQ0JvVEE4b0RxZ09JWTJhSFIwY0RvdkwyTnliQzV6ZVhOMFpXMTBaWE4wTXpRdWRISjFjM1F5TkRBNExtTnZiUzl6ZVhOMFpXMTBaWE4wTXpRdVkzSnNNR0dnWDZCZHBGc3dXVEVMTUFrR0ExVUVCaE1DUkVzeEVqQVFCZ05WQkFvTUNWUlNWVk5VTWpRd09ERW1NQ1FHQTFVRUF3d2RWRkpWVTFReU5EQTRJRk41YzNSbGJYUmxjM1FnV0ZoWVNWWWdRMEV4RGpBTUJnTlZCQU1NQlVOU1RERTBNQjhHQTFVZEl3UVlNQmFBRk0xc2FKYzVjaG1rTmF0azZ2UVJvNEdIK0drN01CMEdBMVVkRGdRV0JCUkJDbmVpSjFSYm0zVE83UzdKK2xEZ1JxM0lGREFKQmdOVkhSTUVBakFBTUEwR0NTcUdTSWIzRFFFQkN3VUFBNElCQVFDaDRzZndZbXlhcHFjUS9oZlh5ZSttcUpRYTlwVGt0alU2T1ZaNVh3cXZuTVNSQXdEYWl4Nmpma1crczFDREJSZEhZL3ZwVUVjek9LVzZwaVBkNngwT2NScktnaHlLMTM4eU44NDcyRXVOYjN2K0E0ZzVBdktndHJSSW9qUnR6VUhPT1F5bDdlNXVtNDlXUUtFc2w4RlZEeEZQYldqemtMSG9Ec2dudnlMWmRPUjAwUWpLSnNLWVZLNlhjdDFSc2g1ekpaRTkvTEhBa0t4MGxCQ01UMlVqcllxSWozcVIreUtRTHV0TEp4aGZhQWlMajloMDBkVk5oVVFLVGI2Y2ZnUGtyLys0MWxnN0N2YVZhcyt3RGhRRFNyc2FUa0Y1NFY5dStoM3E4K0JDM0lXNk9iTU96ODRXcytSYm9sNWQ3cFZrVkplbXZZRDV1cUNDQStZTEczQmo8L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1NpZ25hdHVyZT48U3ViamVjdD48TmFtZUlEIEZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6MS4xOm5hbWVpZC1mb3JtYXQ6WDUwOVN1YmplY3ROYW1lIj5DPURLLE89w5hrb25vbWlzdHlyZWxzZW4gLy8gQ1ZSOjEwMjEzMjMxLENOPU1vcnRlbiBNb3J0ZW5zZW4sU2VyaWFsPUNWUjoxMDIxMzIzMS1SSUQ6OTM5NDc1NTI8L05hbWVJRD48U3ViamVjdENvbmZpcm1hdGlvbiBNZXRob2Q9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpjbTpob2xkZXItb2Yta2V5Ij48U3ViamVjdENvbmZpcm1hdGlvbkRhdGEgYTp0eXBlPSJLZXlJbmZvQ29uZmlybWF0aW9uRGF0YVR5cGUiIHhtbG5zOmE9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIj48S2V5SW5mbyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+PFg1MDlEYXRhPjxYNTA5Q2VydGlmaWNhdGU+TUlJR01EQ0NCUmlnQXdJQkFnSUVYNXVqelRBTkJna3Foa2lHOXcwQkFRc0ZBREJKTVFzd0NRWURWUVFHRXdKRVN6RVNNQkFHQTFVRUNnd0pWRkpWVTFReU5EQTRNU1l3SkFZRFZRUUREQjFVVWxWVFZESTBNRGdnVTNsemRHVnRkR1Z6ZENCWVdGaEpWaUJEUVRBZUZ3MHlNVEF5TURNd056STVNVGxhRncweU5EQXlNRE13TnpJNE5UWmFNSUdaTVFzd0NRWURWUVFHRXdKRVN6RXhNQzhHQTFVRUNnd29SR2xuYVhSaGJHbHpaWEpwYm1kemMzUjVjbVZzYzJWdUlDOHZJRU5XVWpvek5EQTFNVEUzT0RGWE1DQUdBMVVFQlJNWlExWlNPak0wTURVeE1UYzRMVVpKUkRvM01qRTVPRFUxTmpBekJnTlZCQU1NTEU5SlR5QkpSRmRUSUVwaGRtRWdjbVZtTGlCWFUwTWdLR1oxYm10MGFXOXVjMk5sY25ScFptbHJZWFFwTUlJQklqQU5CZ2txaGtpRzl3MEJBUUVGQUFPQ0FROEFNSUlCQ2dLQ0FRRUFnOWcwWmd2bHN3cEtsOSswQXNSd1NzNnVaY00zdTk3T0twUkJmVm85dEJVSTFwZlN2bWIrOGNicHNjNTUzM3lZek42eXNVUWlRRFFMSGVrbVFWa3NqaHd5QzNpbmMvOUVhMHQ1YURqcitNcTlzcVkzNEZWYVdzOEZITkhNQ3hhS3hieG5hOERVUS9GalQvdU5lK21OSm1qU09GU0pYNkdsV1V1RVlkNDBrREJET1J2VXV1RThvUkM1Q3Z1RTEyME1HZmE0eVp3WjRqemp1Q3liTzBaMFJjK3VaWkNNUEJDQ1pkNlpmL3piQUJFcTN4YTJMNExrbmZwNERDRFEwMzFiZDlZSzluYUpuSU9VeS92Y3A3NGZnUWNzd2ZUc3Y2TGVSTHhHUVZNV2xRUGpKMkY1VHdtMGdMbWNSWnUzQlYxWGZXMmhuUUNHakYwaUdJbTVWZmZzOVFJREFRQUJvNElDelRDQ0Fza3dEZ1lEVlIwUEFRSC9CQVFEQWdPNE1JR1hCZ2dyQmdFRkJRY0JBUVNCaWpDQmh6QThCZ2dyQmdFRkJRY3dBWVl3YUhSMGNEb3ZMMjlqYzNBdWMzbHpkR1Z0ZEdWemRETTBMblJ5ZFhOME1qUXdPQzVqYjIwdmNtVnpjRzl1WkdWeU1FY0dDQ3NHQVFVRkJ6QUNoanRvZEhSd09pOHZaaTVoYVdFdWMzbHpkR1Z0ZEdWemRETTBMblJ5ZFhOME1qUXdPQzVqYjIwdmMzbHpkR1Z0ZEdWemRETTBMV05oTG1ObGNqQ0NBU0FHQTFVZElBU0NBUmN3Z2dFVE1JSUJEd1lOS3dZQkJBR0I5RkVDQkFZRUF6Q0IvVEF2QmdnckJnRUZCUWNDQVJZamFIUjBjRG92TDNkM2R5NTBjblZ6ZERJME1EZ3VZMjl0TDNKbGNHOXphWFJ2Y25rd2dja0dDQ3NHQVFVRkJ3SUNNSUc4TUF3V0JVUmhia2xFTUFNQ0FRRWFnYXRFWVc1SlJDQjBaWE4wSUdObGNuUnBabWxyWVhSbGNpQm1jbUVnWkdWdWJtVWdRMEVnZFdSemRHVmtaWE1nZFc1a1pYSWdUMGxFSURFdU15NDJMakV1TkM0eExqTXhNekV6TGpJdU5DNDJMalF1TXk0Z1JHRnVTVVFnZEdWemRDQmpaWEowYVdacFkyRjBaWE1nWm5KdmJTQjBhR2x6SUVOQklHRnlaU0JwYzNOMVpXUWdkVzVrWlhJZ1QwbEVJREV1TXk0MkxqRXVOQzR4TGpNeE16RXpMakl1TkM0MkxqUXVNeTR3Z2EwR0ExVWRId1NCcFRDQm9qQThvRHFnT0lZMmFIUjBjRG92TDJOeWJDNXplWE4wWlcxMFpYTjBNelF1ZEhKMWMzUXlOREE0TG1OdmJTOXplWE4wWlcxMFpYTjBNelF1WTNKc01HS2dZS0JlcEZ3d1dqRUxNQWtHQTFVRUJoTUNSRXN4RWpBUUJnTlZCQW9NQ1ZSU1ZWTlVNalF3T0RFbU1DUUdBMVVFQXd3ZFZGSlZVMVF5TkRBNElGTjVjM1JsYlhSbGMzUWdXRmhZU1ZZZ1EwRXhEekFOQmdOVkJBTU1Ca05TVERFeU5EQWZCZ05WSFNNRUdEQVdnQlROYkdpWE9YSVpwRFdyWk9yMEVhT0JoL2hwT3pBZEJnTlZIUTRFRmdRVXI5d3JpV29HcVZ2NzI1QkpLZllwZCt4WXNsWXdDUVlEVlIwVEJBSXdBREFOQmdrcWhraUc5dzBCQVFzRkFBT0NBUUVBbzRiRGdWVzVzcDVmTUxzbDdnbUM4amxkd1c4dlhrK2ttYVFTajBIZldpQ2FzeHV3SVBIRmVKaXRmQjFqNzFTWXYwV2oyUHg0R2JNaE05WTdyaFlNaE16aE1jLy9lQmY5UDdocDQwSWI3SzNnMmpzVlI3SHBBUzlWcXV1QlFRODZPdWdhSHB2UGY0em5oMHpramd6NUFvMXJod1pYaWVCcGNmZGcwVEc2YytRTSt6VWRmZ0Qwc0gzMmhHaWFXTGFHa3pHZDFKMzJ3NG9HQ2MwR3c5V1pLanJJdTVRWUtEM2JxbTlkdEU2enVkZHNnbllSMW9iMllIRlFocXFtTlA3Qmkxa0puUlhWK1Flcnd6SHZlcWV5cE9sQ3RKS2EwV3hIU3Q2UXJvc1VBanFPMDBIY2N1QjkwUnA5MmZBdzYveTlaZVNlaVpxWVRwQjFqeVY4MFNEMDNBPT08L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1N1YmplY3RDb25maXJtYXRpb25EYXRhPjwvU3ViamVjdENvbmZpcm1hdGlvbj48L1N1YmplY3Q+PENvbmRpdGlvbnMgTm90T25PckFmdGVyPSIyMDIxLTAyLTIyVDE2OjM4OjM1Ljg0MloiPjxBdWRpZW5jZVJlc3RyaWN0aW9uPjxBdWRpZW5jZT5odHRwczovL2Jvb3RzdHJhcC5zdHMubmVtbG9nLWluLmRrLzwvQXVkaWVuY2U+PC9BdWRpZW5jZVJlc3RyaWN0aW9uPjwvQ29uZGl0aW9ucz48QXR0cmlidXRlU3RhdGVtZW50PjxBdHRyaWJ1dGUgTmFtZT0iZGs6bmVtbG9naW46c2FtbDphdHRyaWJ1dGU6SWRQU2Vzc2lvbkluZGV4IiBOYW1lRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXR0cm5hbWUtZm9ybWF0OmJhc2ljIj48QXR0cmlidXRlVmFsdWU+RTEtNDItRTMtRkItOEYtODMtODYtMzItREItMUUtMjctREUtMDYtQjUtMjItOTItNzMtMzUtMkUtQkU8L0F0dHJpYnV0ZVZhbHVlPjwvQXR0cmlidXRlPjxBdHRyaWJ1dGUgTmFtZT0iZGs6bmVtbG9naW46c2FtbDphdHRyaWJ1dGU6U3BFbnRpdHlJZCIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDpiYXNpYyI+PEF0dHJpYnV0ZVZhbHVlPmh0dHBzOi8vc2FtbC5jeGYtc3A8L0F0dHJpYnV0ZVZhbHVlPjwvQXR0cmlidXRlPjwvQXR0cmlidXRlU3RhdGVtZW50PjwvQXNzZXJ0aW9uPg==";
        String requestUrl = "https://digst.oioidws.rest.wsp:10002/";
        Application.setRequestUrl(requestUrl);
        Application.setTokenUrl("https://digst.oioidws.rest.wsp:10002/accesstoken/issue");
        Application.setAudience("https://wsp.oioidws-net.dk");
        ScenarioSingleton.instance.setScenario("https://bootstrap.sts.nemlog-in.dk/");

        TestStsClient.setBootStrapToken(bootstrapBase64);

        SpringApplication.run(Application.class);
        String restResponse = Application.getRestResponse();

        assertTrue(restResponse.contains("AssuranceLevel = 3"));
        assertTrue(restResponse.contains("<200,Requested at "+requestUrl));
        assertTrue(restResponse.contains("AuthenticationType: OioIdws"));
        assertTrue(restResponse.contains("Claims"));
    }

}
